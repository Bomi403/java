package chapter8;

public class extendsEx1 {
	public static void main(String[] args) {
		//B b = new B();
		C c = new C(); // C는 B, A 자료형이 될 수도 있다
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);
	
		// 하위클래스 -> 상위 클래스로 형변화 -> 묵시적으로 가능 -> 업캐스팅
		B d = new C();
		A e = new C();
		
		// 상위 클래스 형변환 -> 하위클래로 변경 -> 명시적으로 형변환 -> 다운캐스팅
		C f = (C)e;
		
	}
}
