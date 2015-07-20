import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

/**
 * @author Rehaan
 * @Date 4:48:39 PM
 * @FileName DriverClass.java
 * @PackageName 
 * @ProjectName JDBCDemo
 *
 **/
public class DriverClass {
	
	public static int i=1;

	public static void main(String[] args) {

		try{
		//Load the Driver Class from the respective JDBC Implemented API, in this case we load it from the MySQL API.
		//Class.forName("com.mysql.jdbc.Driver");
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Connect to the database by passing the url, username and password
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		
		//Create a Statement Object
		Statement stmt = conn.createStatement();
		
		//Create a ResultSet Object to collect the data from the data table. 
		ResultSet rs = stmt.executeQuery("select * from demo.testtable");
		
		//System.out.print("The First Record: ---> ");
		//Iterate through the data gathered.
		while(rs.next()){
			System.out.print("The record No."+i+" is: ---> ");
			System.out.print(rs.getString("name"));
			System.out.print("||");
			System.out.print(rs.getString("email"));
			System.out.print("||");
			System.out.println(rs.getString("address"));
			i++;
		}
		
		//Close the Connection to the data base. 
		conn.close();
		} catch (Exception e){
			e.printStackTrace();
			
		}
	}

}