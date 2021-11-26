package chapter12_1;

public class Ex3 {
	public static void main(String[] args) {
		GenericPrinter<Material> printer = new GenericPrinter<>();		
		printer.addMaterial(new Plastic());
		printer.printing();
		
		printer.addMaterial(new Powder());
		printer.printing();
	}
}
