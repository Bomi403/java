package chapter4;

public class IfEx1 {
	public static void main(String[] args) {
		int num = 9;
		if (num == 10) {
			System.out.println("10 입니다.");
			if (num % 2 == 0) {
				System.out.println("짝수 입니다.");
			}
		} else { 
			System.out.println("10이 아닙니다.");
		}
		
	}
}
