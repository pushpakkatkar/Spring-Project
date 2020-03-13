package com.psl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

static Connection con;
	
	static 
	{
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			//it will load the driver class
			String url = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "root";
			//con will refer current connection
			con = DriverManager.getConnection(url,username,password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public static Connection getConnect()
	{
		return con;
	}	
}
