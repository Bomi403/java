package chapter05_06;

import chapter05_06_1.Book;

public class Ex2 {
	public static void main(String[] args) {
		chapter05_06_1.Book book = new chapter05_06_1.Book();
		
		Book book2 = new Book();
		
		Person person = new Person();
		
		int num1 = 10;
		int num2 = 20;
		int result = person.sum(num1, num2);
		System.out.println(result);
	}
}
