package inheritance;

public class Ex1 {
	public static void main(String[] args) {
		// C클래스의 인스턴스
		// 클래스명과 동일 메서드 -> 생성자 메서드
		C c = new C();
		A a = c; // 
		B b = c;
		
		D d = new D();
		A aa = d;
		if (aa instanceof D) {
			D cc = (D)aa;
		}
	}
}
