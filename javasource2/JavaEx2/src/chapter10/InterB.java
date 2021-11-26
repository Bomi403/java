package chapter10;

public interface InterB {
	void methodB();
	void commonMethod();
	
	default void instanceMethod() {
		System.out.println("인스턴스 메서드");
	}
}
