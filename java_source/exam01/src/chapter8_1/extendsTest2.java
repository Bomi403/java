package chapter8_1;

public class extendsTest2 {
	public static void main(String[] args) {
		D d = new D();
		C c = new C();
		B b = new B();
		 
		// 인스턴스 d 상위 클래스의 모든 메서드, 멤버 변수 -> 상위클래스 C,B,A 등 어떤것이라도 
		// 변환
		C c1 = new D();
		
		// 하위클래스 -> 상위클래스로 형변환 -> 묵시적 변환
		
		//D d1 = new C();
		
		
	}
}
