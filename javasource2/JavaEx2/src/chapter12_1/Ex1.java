package chapter12_1;

public class Ex1 {
	public static void main(String[] args) {
		Printer<Plastic> plasticPrinter = new Printer<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		
		plasticPrinter.run();
		
		Printer<Powder> powderPrinter = new Printer<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		powderPrinter.run();
		
	}
}
