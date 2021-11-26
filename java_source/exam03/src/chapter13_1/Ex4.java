package chapter13_1;

public class Ex4 {
	public static void main(String[] args) {
		OuterClass4 out = new OuterClass4();
		out.in.innerMethod();
		
		InnerAbstractClass in = out.innerMethod();
		in.innerMethod();
	}
}
