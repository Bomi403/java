package chapter12_3;

import java.util.*;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Book> list = new TreeSet<>();
		list.add(new Book("力格2", "历磊2", 20000));
		list.add(new Book("力格3", "历磊3", 30000));
		list.add(new Book("力格1", "历磊1", 10000));
		list.add(new Book("力格2", "历磊2", 20000));
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
