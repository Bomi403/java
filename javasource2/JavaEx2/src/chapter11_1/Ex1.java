package chapter11_1;

import chapter11.*;

public class Ex1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("책이름1", 10000);
		Book book2 = (Book)book.clone();
		System.out.println(book);
		book.setTitle("(수정)책이름1");
		System.out.println(book);
		System.out.println(book2);
	}
}
