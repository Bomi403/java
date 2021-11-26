package chapter13_1;

public class OuterClass {
	class InnerClass {
		public int innerNum = 100;
		public static int innerStaticNum = 100; // 오류 
		
		public void innerMethod() {
			System.out.println("인스턴스 내부 클래스 메서드");
		}
		
		public static void innerStaticMethod() { // 오류
			System.out.println("인스턴스 내부 클래스 정적 메서드");
		}
	}
	
	public static void staticMethod() {
		System.out.println("외부 클래스 정적 메서드");
	}
}
