package chapter8_1;

public class Ex1Test {
	public static void main(String[] args) {
		B b = new B();
		C c = new C(); 
		
		A bb = new B(); // A클래스의 인스턴스 + B 클래스의 인스턴스 + C 클래스의 인스턴스
		A aa = new C(); // A클래스의 인스턴스 + B 클래스의 인스턴스 + C 클래스의 인스턴스
								// C, B, A 자료형
		//C cc = (C)aa; // 다운 캐스팅
	
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C);
		
	}
}
