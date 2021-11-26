package chapter11;

import java.util.*;

public class Ex4 {
	public static void main(String[] args) {
		HashSet<Book> list = new HashSet<Book>();
		list.add(new Book("å1", 1000));
		list.add(new Book("å2", 1000));
		list.add(new Book("å3", 1000));
		list.add(new Book("å1", 1000));
		list.add(new Book("å1", 1000));
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
