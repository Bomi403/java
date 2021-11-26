package chapter8_1;

public class B extends A {
	int numB = 10;
	
	B() {
		super();
		System.out.println("B 생성자");
	}
	
	void methodB() {
		System.out.println("메서드 B");
	}
}
