package chapter11_3;

import java.util.HashSet;

class Book {
	private int num;
	private String title;
	
	public Book(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public int hashCode() {
		return num;
	}
	
	public boolean equals(Object obj) { // Book 인스턴스 
		Book book = (Book)obj;
		if (book.num == num) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		return "번호 : " + num + ", 제목 : " + title;
	}
}


public class Ex1 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		/**
		 * Set 
		 *  중복 여부 - equals, hashCode -> Object -> 인스턴스의 주소
		 */
		/*
		list.add(new Book(100, "책1"));
		list.add(new Book(101, "책2")); // 주소가 다르기 때문에 모두 다른 값으로 인식
		list.add(new Book(102, "책3"));
		list.add(new Book(100, "책1"));
		
		for(Book book : list) {
			System.out.println(book);
		}
		*/

		list.add(new String("ABC"));
		list.add(new String("DEF"));
		list.add(new String("GHI"));
		list.add(new String("ABC"));
		
		for (String s : list) {
			System.out.println(s);
		}

	}
}
