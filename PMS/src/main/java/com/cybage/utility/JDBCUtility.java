package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {

private static Connection connection=null;
	
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			//1.Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.establish connection
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/PMS","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
