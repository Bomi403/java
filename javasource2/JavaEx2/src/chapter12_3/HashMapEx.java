package chapter12_3;

public class HashMapEx {
	public static void main(String[] args) {
		BookHashMap books = new BookHashMap();
		books.add(new Book("力格1", "历磊1", 10000));
		books.add(new Book("力格2", "历磊2", 20000));
		books.add(new Book("力格3", "历磊3", 30000));
		books.add(new Book("力格4", "历磊4", 40000));
		
		books.print();
	}
}
