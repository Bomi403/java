package chapter11;

public class Book implements Cloneable {
	private int price;
	private String title;
	
	public Book(String title, int price) {
		this.price = price;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		return title.equals(book.getTitle());
	}
	
	public int hashCode() {
		return title.hashCode();
	}
	
	public String toString() {
		return "책 이름 : " + title + ", 가격 : " + price;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
