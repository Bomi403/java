package chapter13_1;

public class InnerClassEx2 {
	Ex2AbstractClass ex1 = new Ex2AbstractClass() {
		public void method() {
			System.out.println("method1");
		}
	};
	
	void outMethod() {
		Ex2AbstractClass ex2 = new Ex2AbstractClass() {
			public void method() {
				System.out.println("method2");
			}
		};
		
		ex2.method();
	}
	
	public static void main(String[] args) {
		InnerClassEx2 inClass = new InnerClassEx2();
		inClass.ex1.method();
		inClass.outMethod();
		int num = 10;
		Ex2AbstractClass ex3 = new Ex2AbstractClass() {
			public void method() {
				System.out.println("method3");
			}
		};
		
		ex3.method();
	}
}
