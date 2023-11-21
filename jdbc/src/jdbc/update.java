package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class update {

	public static void main(String[] args) {
		try
		{
			String url="jdbc:mysql://localhost:3306/STUDDB";
			String uname="root";
			String pass="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update sample set STUD_ROLLNO=105 where STUD_ID=1");
			System.out.println("one record updated successfully");
			stmt.close();
			con.close();
		}
        catch(Exception e)
		{
        	System.out.println(e);
		}
	}

}
