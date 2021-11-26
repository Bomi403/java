package chapter8_1;

public class extendsTest {
	public static void main(String[] args) {
		/*
		D d = new D();
		C c = new C();
		B b = new B();
		
		// D 클래스 -> A, B, C 클래스를 모두 포함 
		/**
		 *  D는 D, A, B, C의 인스턴스가 될 수 있다
		 * 
		 */
		/*
		D d = new D();
		d.
		//C c = new C();
		C c = new D();
		B b = new D();
		A a = new D();
		Object o = new D();
		D newA = (D)a;
		*/
		// D는 A. B, C의 멤버변수, 메서드를 모두 가지고 있으므로 A, B, C 어느것이든지 될 수 있다.
		//D d = new B(); // B인스턴의 멤버변수와 메서드가 D가 가지고 있는것을 모두 가지고 있지 않기 때문
		// 상위 클래스의에 하위 클래스 인스턴스가 대입 -> 자동 형변환(묵시적 형변환)
		
		//D d = new D(10); // 매개변수가 있는 생성자 -> 인스턴스
		
	}
}
