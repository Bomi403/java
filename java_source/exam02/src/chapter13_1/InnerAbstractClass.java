package chapter13_1;

public abstract class InnerAbstractClass {
	
		InnerAbstractClass in = new InnerAbstractClass() {
			public void innerMethod() {
				System.out.println("지역내부클래스");
			}
		}
		
		return in;
	}
}
