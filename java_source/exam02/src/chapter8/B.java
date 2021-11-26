package chapter8;

public class B extends A {
	int numB = 20;
	
	B() {
		//super(); //  A 클래스의 기본 생성자
		System.out.println("B 생성자");
	}
	
	void methodB() {
		System.out.println("methodB");
	}
}
