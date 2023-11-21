package jdbc;
import java.sql.*;
public class jdbc1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/STUDDB";
		String uname="root";
		String pass="";
		String query="select STUD_NAME from SAMPLE where STUD_ID=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		rs.next();
		String STUD_NAME=rs.getString("STUD_NAME");
		System.out.println(STUD_NAME);
		stmt.close();
		con.close();
	}

}
