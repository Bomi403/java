package chapter05;

public class Ex2 {
	
	/**
	*
	* num1, num2 -> 함수 영역 안에서만 존재 -> 함수 지역내에서만 존재
	*  지역변수 
	 */
	public static int add(int num1, int num2) {	
		int num3 = 10;
		return num1 + num2 + num3;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int result = add(n1, n2); // 실행 
		System.out.println(result);
	}
}
