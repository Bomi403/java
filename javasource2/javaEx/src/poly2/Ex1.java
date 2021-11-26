package poly2;

public class Ex1 {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		if (a instanceof C) {
			C cc = (C)a;
		}
		
		D d = new D();
		A da = d;
		if (da instanceof D) {
			D dd = (D)da;
		}
	}	
}
