package chapter13_1;

public class Ex1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method();
		Outer.Inner.staticMethod();
	}
}
