package chapter13_4;

import java.util.ArrayList;

public class Q7 {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// 모든 책의 가격의 합
		int total = bookList.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println("책의 가격의 합 = " + total);
		
		// 책의 가격이 20,000 이상인 책의 이름 -> 정렬 -> 출력
		bookList.stream().filter(b -> b.getPrice() >= 20000)
								.map(b -> b.getName())
								.sorted()
								.forEach(s -> System.out.println(s));
	}
}
