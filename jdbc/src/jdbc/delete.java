package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {

	public static void main(String[] args)
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/STUDDB";
			String uname="root";
			String pass="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("delete from sample where STUD_ID=1");
			System.out.println("one record deleted successfully");
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
