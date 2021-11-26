package chapter10;

public interface InterA {
	int numA = 20; // public static final 
	void methodA(); // public abstract 
	
	void commonMethod();
	
	default void instanceMethod() {
		System.out.println("인스턴스 메서드");
	}
	
	static void staticMethod() {
		System.out.println("정적 메서드");
	}
	
	private void privateMethod() {
		System.out.println("private 메서드");
	}
}
