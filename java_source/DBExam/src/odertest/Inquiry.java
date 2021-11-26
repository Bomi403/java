package odertest;

import java.sql.*;

public class Inquiry {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "2364";
		
		String sql = "SELECT * FROM orderts";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int orderId = rs.getInt("orderId");
				String goodsNm = rs.getString("goodsNm");
				int goodsCnt = rs.getInt("goodsCnt");
				int goodsPay = rs.getInt("goodsPay");
				Date orderDt = rs.getDate("orderDt");
				
				System.out.println("�ֹ���ȣ : "+ orderId + " | ��ǰ�� : "+ goodsNm
				+" | �ֹ����� : "+ goodsCnt + " | �����ݾ� : " + goodsPay + " | �ֹ���¥ : " + orderDt	);
			}
			
			rs.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
