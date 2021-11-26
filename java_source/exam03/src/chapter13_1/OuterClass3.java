package chapter13_1;

public class OuterClass3 {
	public InnerAbstractClass outerMethod(int num) {
		class InnerClass extends InnerAbstractClass {
			public void innerMethod() {
				// num -> public final int num -> 상수화
				//num = 100;
				System.out.println("num : " + num);
				System.out.println("지역 내부 클래스 메서드");
			}
		}
		
		InnerClass in = new InnerClass();
		return in;
	}
}
