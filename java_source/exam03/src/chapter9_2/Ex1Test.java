package chapter9_2;

public class Ex1Test {
	AbstractEx ex2 = new AbstractEx() {
		int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	public static void main(String[] args) {
		/**
		 *  1. 지역 내부클래스 -> 메서드 안
		 *  2. 클래스의 변수로 지정
		 *    + 미 구현된 부분을 구현 함을써 
		 *    
		 *   인스턴스를 생성 할 수 있다
		 */
		//int num3 = 30;
		
		AbstractEx ex = new AbstractEx() {
			int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(ex.add(10, 20));
		
		
		Ex1Test ex1test = new Ex1Test();
		System.out.println(ex1test.ex2.add(30, 50));
	}
}
