package chapter13_1;

public class OuterClass4 {
	InnerAbstractClass in = new InnerAbstractClass() {
		public void innerMethod() {
			System.out.println("지역 내부 클래스(변수)");
		}
	};
	
	public InnerAbstractClass innerMethod() {
		
		return new InnerAbstractClass() { // 익명 내부 클래스
			public void innerMethod() {
				System.out.println("지역 내부 클래스");
			}
		};
		
		
	}
}
