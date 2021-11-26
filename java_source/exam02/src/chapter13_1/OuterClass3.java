package chapter13_1;

public class OuterClass3 {
		
	public InnerMyClass outerMethod(int num1, int num2) {
		int num = 20; // 지역 내부 클래스 외부에 정의되어 있는 변수 상수화
		   					// public final -> 데이터 영역, 스택 X
		
		return new InnerMyClass() {
			public void method() {
				System.out.println("지역 내부 클래스");
			}
		};
		/*
		InnerMyClass in = new InnerMyClass() {
			public void method() {
				System.out.println("지역 내부 클래스");
			}
		};
		
		return in;
		*/
		
		/*
		class InnerClass implements InnerMyClass {
			public void method() {
				//num = 30;

				System.out.println("지역 내부 클래스");
				System.out.println("num = " + num);
			}
		}
		
		InnerClass in = new InnerClass();
		
		return in;
		*/
	}
}
