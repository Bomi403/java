package chapter8_1;

public class C extends B {
	int numC = 10;

	C() {
		System.out.println("C 생성자");
	}
	
	C(int numC) {
		//super(); // B클래스의 B() 기본생성자로 이동
		this.numC = numC;
	}
	

	
	void methodC() {
		System.out.println("메서드 C");
	}
}
