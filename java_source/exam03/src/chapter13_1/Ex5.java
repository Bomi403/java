package chapter13_1;

interface interEx {
	void innerMethod(); // -> public abstract
}

public class Ex5 {
	public static void main(String[] args) {
		int num = 100;
		interEx ex = new interEx() {
			public void innerMethod() {
				System.out.println("메서드 호출");
			}
		};
		ex.innerMethod();
	}
}
