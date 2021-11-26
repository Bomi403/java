package chapter8_2;

public class ClassEx3 {
	public static void main(String[] args) {
		int num1 = 100;
		Integer num2 = Integer.valueOf(200);
		
		int num3 = num1 + num2;
		// num2 -> 언박싱 -> Interger -> int (intValue)
		System.out.println(num3);
		
		Integer num4 = num1;
		// int -> Integer 오토박싱(valueOf)
		
	
	}
}
