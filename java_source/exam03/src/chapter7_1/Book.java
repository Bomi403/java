package chapter7_1;

public class Book {
	private int bookNo; // 도서 번호
	private String title; // 도서 제목 
	
	public Book(int bookNo, String title) {
		this.bookNo = bookNo;
		this.title = title;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void showInfo() {
		System.out.println("도서 번호 : " + bookNo + ", 도서제목 : " + title);
	}
}
