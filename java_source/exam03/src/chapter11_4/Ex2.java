package chapter11_4;

public class Ex2 {
	public static void main(String[] args) {
		String text1 = new String("ABC"); // final byte[] -> 상수  -> 불변
		System.out.println("text1 Brefore : " + System.identityHashCode(text1));
		String text2 = new String("DEF"); // final byte[] -> 상수 -> 불변
		
		
		text1 += text2;
		System.out.println("text1 After1 : " + System.identityHashCode(text1));
		text1 += "GHI";
		System.out.println("text1 After2 : " + System.identityHashCode(text1));
		text1 += "JKL"; 
		System.out.println("text1 After3 : " + System.identityHashCode(text1));
		System.out.println(text1);
		
		
	}
}
