package chapter10_2;

public interface Buy {
	int num = 30; // 컴파일시에 추가 정적 상수 public static final 
	void buy(); // public abstract 
	
	default void order() {
		System.out.println("Buy - order메서드");
		privateMethod();
	}
	
	static void showInfo() {
		System.out.println("static Buy!");
	}
	
	private void privateMethod() {
		System.out.println("private 메서드");
	}
}
