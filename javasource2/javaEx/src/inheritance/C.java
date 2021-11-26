package inheritance;

public class C extends B {
	int numC = 30;
	/**
	 * 1. 생성자 메서드의 가장 중요한 목적
	 * 
	 */
	public C() {
		super(); // 상위 클래스의 생성자 호출(컴파일시에 자동 추가)
		System.out.println("C생성자!");
	}
}
