package chapter12_3;

public class TreeMapEx {
	public static void main(String[] args) {
		BookTreeMap books = new BookTreeMap();
		books.add(new Book("力格3", "历磊3", 30000));
		books.add(new Book("力格1", "历磊1", 10000));
		books.add(new Book("力格2", "历磊2", 20000));
		books.add(new Book("力格4", "历磊4", 40000));
		
		books.print();
	}
}
