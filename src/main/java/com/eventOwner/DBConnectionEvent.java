package com.eventOwner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionEvent {

	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/onlineeventmanagementsystem2";
		String username = "root";
		String password = "purna123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
			System.out.println(" connection eka athulataath awa udata awaaaa");
			
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if(con != null)
		{
			System.out.println("connection made!!");
		}
		return con;
	}

}
