package dbexam;

import java.sql.*;

public class Del2 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "2364";
		
		String sql = "CALL DeleteOrder(?)";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				CallableStatement cstmt = conn.prepareCall(sql)) {
		cstmt.setInt(1,  Integer, parseInt(args[0]));
		
		int rs = cstmt.executeUpdate();
		if (rs > 0) {
			
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}	
