package chapter13_1;

public class OuterClass3 {
	
	public InnerMyClass outerMethod() {
		class InnerClass implements InnerMyClass {
			public void method() {
				System.out.println("���� ���� Ŭ����");
			}
		}
		
		InnerClass in = new InnerClass();
		
		return in;
	}
}
