package jdbc;
import java.sql.*;
public class selectsample {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/STUDDB";
        String uname="root";
        String pass="";
        try
        {
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement stmt=con.createStatement();
            String query="select * from sample";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                int STUD_ID=rs.getInt(1);
                String STUD_NAME=rs.getString(2);
                int STUD_ROLLNO=rs.getInt(3);
                String STUD_ADDRESS=rs.getString(4);
                System.out.println(STUD_ID+","+STUD_NAME+","+STUD_ROLLNO+","+STUD_ADDRESS);
            }
            con.close();
            stmt.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
	}

}
