package dbexam;

import java.sql.*;

public class Ex10 {
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length != 4) {
			System.err.println("사용법 확인 요망!");
			System.exit(1);
		}
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		// Statement, PreparedStatement, CallableStatement
		/**
		 * ResultSet executeQuery() - SELECT -> 데이터 조회 -> 데이터가 여러개 행
		 * 			ResultSet -> next() -> 다음 투플이 있으면 true 반환 -> 다음 투플로 이동
		 * 							-> getXxx(숫자 - 속성의 순서(1부터 시작));
		 *  					    -> getXxx("컬럼명");
		 *  
		 * int executeUpdate() - INSERT, UPDATE, DELETE
		 * 					반영된 투플의 갯수  
		 */
		String sql = "CALL InsertBook2(?, ?, ?, ?)";
		String sql2 = "SELECT * FROM Book";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				CallableStatement cstmt = conn.prepareCall(sql);
				PreparedStatement pstmt = conn.prepareStatement(sql2)) {
			
			cstmt.setInt(1, Integer.parseInt(args[0]));
			cstmt.setString(2, args[1]);
			cstmt.setString(3, args[2]);
			cstmt.setInt(4, Integer.parseInt(args[3]));
			int rs = cstmt.executeUpdate();
			System.out.println("affected rows : " + rs);
			
			ResultSet rs2 = pstmt.executeQuery();
			// next() -> 다음 투플이 있으면 true -> 다음 투플로 이동
			while(rs2.next()) {
				int bookid = rs2.getInt("bookid");
				String bookname = rs2.getString("bookname");
				String publisher = rs2.getString("publisher");
				int price = rs2.getInt("price");
				
				System.out.println("bookid = " + bookid + ", bookname = " + bookname + ", publisher = " + publisher + ", price = " + price);
			}
			
			rs2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
