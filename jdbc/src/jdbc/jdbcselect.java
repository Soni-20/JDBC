package jdbc;
import java.sql.*;
public class jdbcselect {

	public static void main(String[] args) throws Exception {
		try
		{
			String url="jdbc:mysql://localhost:3306/STUDDB";
			String uname="root";
			String pass="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from sample");
			ResultSetMetaData rm=rs.getMetaData();
			//for(int i=0;i<4;i++)
			//{
				//System.out.println(rm.getColumnName(i)+"\t");
			//}
			//System.out.println();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t");
				System.out.println(rs.getString(2)+"\t");
				System.out.println(rs.getInt(3)+"\t");
				System.out.println(rs.getString(4)+"\t");
			}
			stmt.close();
			con.close();
			
					
			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
