package chapter10_6;

public interface Buy {
	void buy();
	
	default int getPrice() {
		description();
		privateMethod();
		return 10000;
	}
	
	default void showInfo() {
		System.out.println("Buy 인터페이스");
	}
	
	static void description() {
		System.out.println("Buy 인터페이스");
	}
	
	private void privateMethod() {
		System.out.println("Buy 인터페이스 내부에서만 접근 가능");
	}
	
}
