package chapter10;

public class Ex2 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		InterA ia = a;
		InterB ib = a;
		
		if (ib instanceof ClassA) {
			ClassA aa = (ClassA)ib;
		}
	}
}
