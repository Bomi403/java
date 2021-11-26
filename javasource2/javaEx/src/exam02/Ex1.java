package exam02;

public class Ex1 {
	public static void main(String[] args) {
		/**
		 * %s -> 문자열 치환
		 * %d -> 정수 치환
		 * %f -> 실수 치환
		 * %n -> 줄 개행 문자
		 */
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.printf("%d + %d = %d%n", num1, num2, result);
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
