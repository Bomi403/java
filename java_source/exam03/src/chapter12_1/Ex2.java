package chapter12_1;

public class Ex2 {
	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.addMaterial(new Plastic());
		plasticPrinter.printing();
		Plastic plastic = plasticPrinter.getMaterial();
		
		
		/*
		Plastic plastic = plasticPrinter.getMaterial();
		plastic.doPrinting();
		*/
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.addMaterial(new Powder());
		powderPrinter.printing();
		/*
		Powder powder = powderPrinter.getMaterial();
		powder.doPrinting();
		*/
		// GenericPrinter<Powder> -> 제네렉 자료형, Powder -> 대입된 자료형 
		
	}
}
