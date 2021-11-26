package chapter13_1;

public class OuterClass2 {
	int num = 10;
	static int sNum = 20;
	
	static class InnerClass {
		void method() {
			num = 20;
		}
	}
	
	
	static void outerMethod() {
		sNum = 30;
	}
}