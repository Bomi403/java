package chapter14_2;

public class Ex5 {
	public static void main(String[] args) /* throws ClassNotFoundException */ {
		ThrowsEx1 ex1 = new ThrowsEx1();
		ex1.method();
		

		try {
			ex1.method2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//ex1.method2();
	}
}
