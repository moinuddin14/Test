import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Driver;

/**
 * @author Rehaan
 * @Date 2:29:53 PM
 * @FileName DriverClass.java
 * @PackageName 
 * @ProjectName JDBCDemo
 *
 **/
public class DriverClass {

	public static void main(String[] args) {


		try {
			
			//Loading the MySQL Driver Class
			//Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Started loading");
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			System.out.println("Completed loading the driver");
			
			//Connect to the Database using DriverManager Class
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			
			//Create a statement object
			Statement stmt = conn.createStatement();
			
			//Create a Result Set Object to capture all the values from the Database's Table name
			ResultSet rs = stmt.executeQuery("select * from demo.testtable");
			
			while(rs.next()){
				System.out.println(rs.getString("name"));
			}
			
			System.out.println("Closing the Database Connection");
			conn.close();
			System.out.println("Closed the Database Connection");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}