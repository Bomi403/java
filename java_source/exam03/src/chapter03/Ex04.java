package chapter03;

public class Ex04 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = 0;
		if ((num2 = num + 10) > 10 || (num2 = num + 20) < 100) {
			System.out.println(num2);
		}
		
		boolean bool = false;
		System.out.println(!bool); // false -> true
		
		num *= 10;
		System.out.println(num);
		
	}
}
