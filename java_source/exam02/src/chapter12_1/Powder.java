package chapter12_1;

public class Powder  extends Material {
	public void doPrinting() {
		System.out.println("Powder로 프린팅");
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Powder 재료";
	}
}
