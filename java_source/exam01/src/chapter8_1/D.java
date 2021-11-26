package chapter8_1;

public class D extends C {
	int numD = 10;

	D() {
		System.out.println("D 생성자");
	}
	
	D(int numD) {
		super(numD); // C 클래스 생성자 -> numC 존재 하려면 super() 호출 완료 인스턴스가 생성
		this.numD = numD;
	}
	
	void methodD() {
		System.out.println("메서드 D");
	}
}