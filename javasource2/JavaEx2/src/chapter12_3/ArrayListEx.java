package chapter12_3;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("力格1", "历磊1", 10000));
		list.add(new Book("力格2", "历磊2", 20000));
		list.add(new Book("力格3", "历磊3", 30000));
		/*
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book);
		}
		*/
		/*
		Iterator<Book> ir = list.iterator();
		while(ir.hasNext()) {
			Book book = ir.next();
			System.out.println(book);
		}
		*/
		/*
		for (Book book : list) {
			System.out.println(book);
		}
		*/
	}
}
