package test;

public class ExTest {
	public static void main(String[] args) {
		Ex2 ex2 = new Ex2() {
			public void method1() {
				System.out.println("test");
			}
		};
		
		ex2.method1();
	}
}
