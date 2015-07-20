package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Rehaan
 * @Date 11:32:56 PM
 * @FileName DriverClass.java
 * @PackageName 
 * @ProjectName JDBCDemo
 *
 **/
public class DriverClass {

	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc.mysql://localhost:3306/demo", "root", "root");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from demo.testtable");
			
			while(rs.next()){
				
				System.out.println(rs.getString("name"));
			}
			
			System.out.println("Closing the Database Connection");
			
			conn.close();
			
			System.out.println("Database Connection Closed");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
