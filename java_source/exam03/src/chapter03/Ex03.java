package chapter03;

public class Ex03 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = ++num; // 연산(11) -> 대입
		System.out.println(num2);
		
		int num3 = num++; // 대입(11) -> 연산(12)
		System.out.println(num3);
		System.out.println(num);
 	}
}
