package odertest;

import java.sql.*;

public class Process {
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length != 3) {
			System.err.println("��ǰ��, ����, �ݾ��� �Է����ּ���");
			System.exit(1);
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "2364";
		
		String sql="CALL InsertOrderts(?,?,?)";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				CallableStatement cstmt = conn.prepareCall(sql)) {
			
			cstmt.setString(1, args[0]);
			cstmt.setInt(2, Integer.parseInt(args[1]));
			cstmt.setInt(3, Integer.parseInt(args[2]));
			int rs = cstmt.executeUpdate();
			if (rs > 0) {
				System.out.println("�ֹ������� �Ϸ� �Ǿ����ϴ�.");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
