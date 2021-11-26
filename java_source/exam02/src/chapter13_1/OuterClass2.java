package chapter13_1;

public class OuterClass2 {
	int num = 10;
	static int sNum = 20;
	
	static class InnerClass {
		static int sInNum = 30;
		int inNum = 30;
		void method() {
			//num = 20;
			//outerMethod2();
			//sNum = 30;
			//outerMethod();
			inNum = 40;
			sInNum = 50;
			System.out.println("static 내부 클래스 메서드");
		}
	}
	
	void outerMethod2() {
		
	}
	
	static void outerMethod() {
		//num = 20;
		sNum = 30;
	}
}
