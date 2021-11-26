package chapter08;

public class Ex1 {
	public static void main(String[] args) {
		C c = new C();
		A a = c; // 묵시적 형변환
		B b = c; // 묵시적 형변환
		Object o = c;
		D d = new D();
		B b2 = d;
		D d2 = (D)b2;
		
		if (b2 instanceof C) {
			C c2 = (C)b2;
		}
		
	}
}
