package chapater10_1;

public class Ex1Test {
	public static void main(String[] args) {
		/*
		 * ex1 인스턴스 + A, B 인터페이스 -> ex1 -> Ex1, A, B 
		 */
		Ex1 ex1 = new Ex1(); // A, B 인터페이스를 구현,
			
		ex1.methodA();
		ex1.methodB();
		
		A a = ex1;
		
		B b = ex1;
	}
}
