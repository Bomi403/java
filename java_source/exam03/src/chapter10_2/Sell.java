package chapter10_2;

public interface Sell {
	void sell(); // public abstract
	
	default void order() {
		System.out.println("Sell - order ¸Þ¼­µå");
	}
}
