package chapter11_2;

public class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("도서명 : " + name + ", 판매가 : " + price);
	}

	@Override
	public String toString() {
		return "도서명 : " + name + ", 판매가 : " + price;
	}
}
