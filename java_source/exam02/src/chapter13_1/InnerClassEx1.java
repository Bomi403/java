package chapter13_1;

public class InnerClassEx1 {
	Ex1Interface ex2 = new Ex1Interface() {
		public void method() {
			System.out.println("method1");
		}
	};
	
	public void method() {
		int num = 10;
		Ex1Interface ex1 = new Ex1Interface() {
			//num = 20;
			public void method() {
				System.out.println(num + " : method2");
			}
		};
		
		ex1.method();
	}
	
	public static void main(String[] args) {
		InnerClassEx1 ex1 = new InnerClassEx1();
		ex1.method();
		
		ex1.ex2.method();
	}
}
