package chapter10_7;

public class BookShelfTest {
	public static void main(String[] args) {
		BookShelf shelf = new BookShelf();
		shelf.enQueue("자바프로그래밍 입문");
		shelf.enQueue("데이터베이스 이론과 기초");
		shelf.enQueue("쉽게 배우는 JSP");
		
		System.out.println(shelf.deQueue()); // 자바프로그래밍 입문 제거
		System.out.println(shelf.deQueue()); // 데이터베이스 이론과 기초
		System.out.println(shelf.deQueue()); // 쉽게 배우는 JSP
	}
}
