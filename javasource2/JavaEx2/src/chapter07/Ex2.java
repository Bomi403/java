package chapter07;

import chapter05_06_1.*;

public class Ex2 {
	public static void main(String[] args) throws Exception {
		Book[] books = new Book[3];
		
		books[0] = new Book("力格1", 20000);
		books[1] = new Book("力格2", 30000);
		books[2] = new Book("力格3", 40000);
		
	
		System.out.println("-------------------- book2 ------------");
		Book[] books2 = new Book[3];
		for (int i = 0; i < books2.length; i++) {
			books2[i] = (Book)books[i].clone();
		}
		
		//System.arraycopy(books, 0, books2, 0, 3);
		
		books2[1].title = "(荐沥)力格2";
		for (int i = 0; i < books2.length; i++) {
			books2[i].print();
		}
		
		
		
		System.out.println("-------------------- book1 ------------");
		for (int i = 0; i < books.length; i++) {
			books[i].print();
		}
		
	}
}
