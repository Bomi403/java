package chapter13_1;

public class OuterClass3 {
	
	public InnerMyClass outerMethod() {
		class InnerClass implements InnerMyClass {
			public void method() {
				System.out.println("지역 내부 클래스");
			}
		}
		
		InnerClass in = new InnerClass();
		
		return in;
	}
}
