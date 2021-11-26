package chapter8_1;

public class B extends A {
	int numB = 20;
	
	B() {
		super();
		//System.out.println("B 생성자");
	}
	
	void methodB() {
		System.out.println("메서드B");
	}


	protected void method() {
		System.out.println("B클래스 메서드");
	}

}
