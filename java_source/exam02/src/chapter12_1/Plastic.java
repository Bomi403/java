package chapter12_1;

public class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic 재료로 프린팅");
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Plastic 재료";
	}
}
