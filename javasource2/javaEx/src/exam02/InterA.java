package exam02;

public interface InterA {
	public void methodA();
	
	default void printA() {
		System.out.println("A");
	}
}
