package chapter11_6;

public class Ex1 {
	public static void main(String[] args) throws ClassNotFoundException  {
		/** 
		 * 1. Object 클래스 - getClass() 
		 * 2. 모든 클래스에는 정적 변수 -> class -> Class 인스턴스 반환 
		 */
		Book book = new Book("책1", 20000);
		Class cls = book.getClass();
		System.out.println(cls.getName());
		
		Class cls2 = Book.class;
		System.out.println(cls2.getName());
		
		Class cls3 = Class.forName("chapter11_6.Book");
		System.out.println(cls3.getName());
	}
}
