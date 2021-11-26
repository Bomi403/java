package chapter13;

public class OuterClass {
	int outerNum = 20;
	static int outerStaticNum = 30;
	static class InnerClass {
		int num = 10;
		static int num2 = 20;// 16 -> 이전 -> 오류, 16 -> 이후 -> 가능
		
		public void method() {
			//System.out.println(outerNum);
			System.out.println(outerStaticNum);
			//outerMethod();
		}
		
		public static void staticMethod() { // 16 -> 이전 -> 오류, 16 -> 이후 -> 가능
			
		}
	}
	
	public void outerMethod() {
		
	}
}
