package jdbc;

import java.sql.*;

public class insert {
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
			
			PreparedStatement ps=null;
			ps=  con.prepareStatement("insert into sample values(1,'soni',101,'chirakkonathu')");
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("failed");
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
