package chapter12_1;

public class Powder extends Material {
	
	public void doPrinting() {
		System.out.println("파우더로 프린팅...");
	}
	
	@Override
	public String toString() {
		return "파우더";
	}
}
