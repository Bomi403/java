package bookproject;

public class Book {
	private int bookID;
	private String bookTitle;
	private String bookAuthor;
	
	public Book() {}
	
	public Book(int bookID, String bookTitle, String bookAuthor) {
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String toString() {
		return "도서 번호 : " + bookID + " 도서 제목 : " + bookTitle + " 작가 : " + bookAuthor; 
	}
}
