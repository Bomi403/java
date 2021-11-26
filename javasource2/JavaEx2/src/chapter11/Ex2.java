package chapter11;

public class Ex2 {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "ÀÌ¸§1");
		s1.print();
		System.out.println(s1); // toString() -> Object -- toString()
		
		String text = new String("abc");
		String text2 = new String("abc");
		System.out.println(text.toString());
		System.out.println(text);
		
		System.out.println(text2);
		System.out.println(text == text2);
		System.out.println(text.equals(text2)); // true
		System.out.println(text.hashCode());
		System.out.println(text2.hashCode());
		
		/*
		String text3 = "abc";
		String text4 = "abc";
		
		System.out.println(text3 == text4);
		*/
	}
}
