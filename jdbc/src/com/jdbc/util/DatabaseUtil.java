package com.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class DatabaseUtil {
	public Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/STUDDB";
		String uname="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		return DriverManager.getConnection(url,uname,pass);
	}
	
	

}
