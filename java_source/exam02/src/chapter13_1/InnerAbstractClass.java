package chapter13_1;

public abstract class InnerAbstractClass {
	
		InnerAbstractClass in = new InnerAbstractClass() {
			public void innerMethod() {
				System.out.println("��������Ŭ����");
			}
		}
		
		return in;
	}
}
