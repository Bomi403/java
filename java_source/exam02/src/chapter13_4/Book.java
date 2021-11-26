package chapter13_4;

public class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
