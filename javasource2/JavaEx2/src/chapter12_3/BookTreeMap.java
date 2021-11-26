package chapter12_3;

import java.util.*;

class IntegerDesc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2) * -1;
	}
	
}

public class BookTreeMap {
	// Integer - compareTo 
	//TreeMap<Integer, Book> list = new TreeMap<>(new IntegerDesc());
	TreeMap<Integer, Book> list = new TreeMap<>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2) * -1;
		}
		
	});
	public void add(Book book) {
		list.put(book.getBookNo(), book);
	}
	
	public void print() {	
		for (Map.Entry<Integer, Book> map : list.entrySet()) {
			System.out.printf("Key = %d, book = %s%n", map.getKey(), map.getValue());
		}
	}
}
