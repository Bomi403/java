package chapter02;

public class Ex7 {
	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 10;
		int num3 = 10;
		
		System.out.println(num1 == num2); // 주소가 같다
		
		
		Integer num4 = new Integer(10);
		Integer num5 = new Integer(10);
		
		System.out.println(num4 == num5);
		
		String text1 = "ABC";
		String text2 = "ABC";
		System.out.println(text1 == text2);
		
		String text3 = new String("ABC");
		String text4 = new String("ABC");
		System.out.println(text3 == text4);
	}
}
