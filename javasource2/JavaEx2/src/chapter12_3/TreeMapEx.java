package chapter12_3;

public class TreeMapEx {
	public static void main(String[] args) {
		BookTreeMap books = new BookTreeMap();
		books.add(new Book("����3", "����3", 30000));
		books.add(new Book("����1", "����1", 10000));
		books.add(new Book("����2", "����2", 20000));
		books.add(new Book("����4", "����4", 40000));
		
		books.print();
	}
}