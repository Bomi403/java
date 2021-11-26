package chapter11_2;

public class Ex1 {
	public static void main(String[] args) {
		String text1 = new String("Java is");
		System.out.println(System.identityHashCode(text1));
		String text2 = new String(" very fun!");
		text1 += text2;
		System.out.println(System.identityHashCode(text1));
	}
}
