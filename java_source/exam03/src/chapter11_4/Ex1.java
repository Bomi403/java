package chapter11_4;

public class Ex1 {
	public static void main(String[] args) {
		String text1 = new String("ABC"); // 힙
		String text2 = new String("ABC"); // 힙 
		System.out.println(text1 == text2); // == -> 주소 -> X 
		
		String text3 = "ABC"; // text3 -> 독립된 메모리 공간
		String text4 = "ABC"; // text4 -> 독립된 메모리 공간
		

		System.out.println(text3 == text3);
	}
}
