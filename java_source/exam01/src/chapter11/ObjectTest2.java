package chapter11;

public class ObjectTest2 {
	public static void main(String[] args) {
		Book book1 = new Book("�ڹ����α׷��� �Թ�", 22000);
		Book book2 = new Book("�ڹ����α׷��� �Թ�", 22000);
		Book book3 = book2;// book3�� book2�� ������(�ν��Ͻ��� �ּ�)
		
		//System.out.println(book1.equals(book2));
		//System.out.println(book3.equals(book2));
		
		String text1 = new String("ABC");
		String text2 = new String("ABC");
		System.out.println("text1 : " + System.identityHashCode(text1));
		System.out.println("text2 : " + System.identityHashCode(text2));
		
		System.out.println(text1.equals(text2));
	}
}
