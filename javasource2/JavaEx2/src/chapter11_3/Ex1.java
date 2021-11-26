package chapter11_3;

public class Ex1 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt("1000");
		Integer num2 = Integer.valueOf("2000");
		
		int result = num1 + num2; // Integer num2 -> int num2 (num2.intValue())
		System.out.println(result);
		Integer num3 = result; // int result  --> Integer result (Integer.valueOf())
		
		
		
		
		
		
	}
}
