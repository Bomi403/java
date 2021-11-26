package chapter07;

public class Ex3 {
	static int sum(int num1, int num2) {// num1, num2 함수가 실행될때만 존재(지역변수)
		
		int result = num1 + num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println(result);
	}
	
}
