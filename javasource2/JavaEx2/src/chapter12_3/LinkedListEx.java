package chapter12_3;

import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Book> list = new LinkedList<>();
		list.add(new Book("力格1", "历磊1", 10000));
		list.add(new Book("力格2", "历磊2", 20000));
		list.add(new Book("力格3", "历磊3", 30000));
		list.addFirst(new Book("力格0", "历磊0", 5000));
		list.addLast(new Book("力格4", "历磊4", 40000));
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		Book bookFirst = list.getFirst();
		System.out.println(bookFirst);
	}
}
