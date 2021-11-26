package chapter11_2;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("자바 프로그래밍 입문", 25000));
		books.add(new Book("데이터베이스 입문", 20000));
		
		for(Book book : books) {
			//book.showInfo();
			System.out.println(book); //
		}
	}
}
