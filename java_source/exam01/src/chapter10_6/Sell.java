package chapter10_6;

public interface Sell {
	void sell();
	
	default int getPrice() {
		return 10000;
	}
	
	default void showInfo() {
		System.out.println("Sell 인터페이스");
	}
}
