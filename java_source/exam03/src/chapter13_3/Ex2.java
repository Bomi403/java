package chapter13_3;

import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("책1", 10000));
		books.add(new Book("책5", 25000));
		books.add(new Book("책2", 20000));
		books.add(new Book("책3", 30000));
		
		
		//books.stream().filter(b -> b.getPrice() >= 20000).forEach(b -> System.out.println(b));
		books.stream().filter(b -> b.getPrice() >= 20000)
		                      .filter(b -> b.getBookName().equals("책2"))
							 .map(b -> b.getBookName())
							 .sorted((s1, s2) -> s1.compareTo(s2) * -1)
							 .forEach(s -> System.out.println(s));
		
		// 숫자 -> mapToInt, mapToLong, mapToDouble
		
		int total = books.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println(total);
		
	}
}
