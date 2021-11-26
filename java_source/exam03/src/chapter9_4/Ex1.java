package chapter9_4;

public class Ex1 {
	AbstractEx ex2 = new AbstractEx() {
		int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	public static void main(String[] args) {
		/**
		 * 1) 지역 내부 클래스(익명 내부 클래스) - 메서드 내에서 인스턴스 생성  
		 * 2) 클래스의 변수
		 * + 미 구현된 부분을 구현 함으로써 
		 * 인스턴스 생성 가능
		 */
		int num3 = 30; // 지역변수 -> main 함수 호출 -> 스택 -> 종료 -> 제거
		// 지역 내부 클래스에서 사용하는 지역변수 -> 항상 접근 가능하게 변경
		// 상수화 되어 -> 데이터 영역에 남아 있게 된다.(public final -> 컴파일러가 자동으로 추가)
		AbstractEx ex1 = new AbstractEx() { // 힙 영역 
			int add(int num1, int num2) {
				return num1 + num2 + num3;
			}
		};
		
		System.out.println(ex1.add(10, 20));
		
		Ex1 ex = new Ex1();
		System.out.println(ex.ex2.add(20, 30));
	}
}
