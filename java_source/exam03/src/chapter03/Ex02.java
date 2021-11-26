package chapter03;

public class Ex02 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 40; i++) {
			int roomNo = i % 10;
			roomNo = (roomNo == 0)?10:roomNo;
			
			System.out.println("학생 " + i + ", 방번호 :" + roomNo);
		}
		
	}
}
