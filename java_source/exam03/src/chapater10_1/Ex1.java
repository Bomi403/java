package chapater10_1;

public class Ex1 implements A, B { // 인터페스 A, B -> Ex1 인스턴스 보다 먼저 생성 

	@Override
	public void methodA() {
		System.out.println("메서드 A");
	}

	@Override
	public void methodB() {
		System.out.println("메서드 B");
	}

	@Override
	public void methodC() {
		System.out.println("메서드 C");
	}
}
