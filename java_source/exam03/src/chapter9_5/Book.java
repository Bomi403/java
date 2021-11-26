package chapter9_5;

public class Book {
	

	public int num; // 도서번호
	public String title; // 도서 제목 
	
	public Book(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public int hashCode() {
		return num; // 도서 번호
	}

	@Override
	public boolean equals(Object obj) {
		// 도서 번호가 같으면 -> 논리적으로 같다
		Book book = (Book)obj;
		if (book.getNum() == num) {
			return true;
		}
		
		return false;
	}
	@Override
	public String toString() {
		return "도서번호 : " + num + ", 도서제목: " + title;
	}
}
