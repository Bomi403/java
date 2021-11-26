package odertest;

import java.sql.*;

public class Del {
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length !=1) {
			System.err.println("삭제할 주문번호를 입력해주세요");
			System.exit(1);
		}
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "2364";
		
		String sql = "CALL DelOrderts(?)";
		try (Connection conn = DriverManager.getConnection(url, user, password); 
			CallableStatement cstmt = conn.prepareCall(sql)) {
			cstmt.setInt(1,  Integer.parseInt(args[0]));
			
			int rs = cstmt.executeUpdate();
			if (rs > 0) {
				System.out.println("주문접수가 취소되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
