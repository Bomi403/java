package chapter8_1;

public class C extends B {
	int numC = 30;
	
	C() {
		super();
		//System.out.println("C 생성자");
	}
	
	void methodC() {
		System.out.println("메서드C");
	}
	
	@Override
	public void method() {
		System.out.println("C 클래스의 메서드");
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
}
