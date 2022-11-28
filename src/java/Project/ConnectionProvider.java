package Project;


import java.sql.*;
public class ConnectionProvider {
	
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
			return con;
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			return null;
		}
		
	}
	

}
