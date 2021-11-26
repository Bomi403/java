package dbexam;

import java.sql.*;

public class order2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "2364";
		
		String sql="CALL InsertOrder(?,?)";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				CallableStatement cstmt = conn.prepareCall(sql)) {
			cstmt.setString (1, "현대캐스퍼");
			cstmt.setInt(2,Integer.parseInt(args 8);
			int rs = cstmt.executeUpdate();
			if (rs > 0) {
				System.out.println("주문이 접수되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
