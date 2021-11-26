package chapter10;

public interface InterA extends InterC, InterD {
	int numA = 20; // 컴파일러가 자동으로 public static final 
	int sumA(int num1, int num2); // 컴파일러가 자동으로 public abstract
	int sum(int num1, int num2);
	
	default int minus(int num1, int num2) {
		privatePrint();
		return num1 - num2;
	}
	
	public static void print() {
		System.out.println("테스트");
	}
	
	private void privatePrint() {
		System.out.println("private 테스트 - 인터페이스 내부에서만");
	}
}
