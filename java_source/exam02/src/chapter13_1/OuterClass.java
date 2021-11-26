package chapter13_1;

public class OuterClass {
	public int num = 10;
	private static int snum = 20;

	class InnerClass {
		int inNum = 10;
		static int inSNum = 20; // 오류- jdk 15 이하, jdk16 이상 - 오류 X
		
		void innerMethod() {
			System.out.println("OuterClass num : " + num);
			System.out.println("OuterClass snum : " + snum);
			System.out.println("InnerClass inNum : " + inNum);
			System.out.println("InnerClass inSnum : " + inSNum);
		}
		
		static void innerStaticMethod() { // jdk15 이하 오류, jdk 16 이상 오류 X  
			System.out.println("static 메서드");
		}
	}
}
