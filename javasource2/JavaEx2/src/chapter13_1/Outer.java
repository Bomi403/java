package chapter13_1;

public class Outer {
	public int outerNumA = 10;
	public static int OuterNumB = 20;
	
	class Inner { // 멤버 변수와 거의 비슷한 특징, Outer 클래스의 인스턴스 생성 이후에 생성  
		public int numA = 10;
		public static int numB = 20; // 15버전 이하는 사용 불가 
		
		public void method() {
			System.out.println(outerNumA);
			System.out.println(OuterNumB);
		}
		
		public static void staticMethod() {
			//System.out.println(outerNumA);
			System.out.println("정적 메서드");
		}
	}
}
