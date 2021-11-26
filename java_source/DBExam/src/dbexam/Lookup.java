package dbexam;

import java.sql.*;

public class Lookup {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "2364";
		
		String sql = "SELECT * FROM Order2";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
				
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int orderNo = rs.getInt("orderNo");
				String goodsNm = rs.getString("goodsNm");
				int goodsCnt = rs.getInt("goodsCnt");
				System.out.println("orderNo="+ orderNo+"goodsNm" + goodsNm);
			}
			rs.close()
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
