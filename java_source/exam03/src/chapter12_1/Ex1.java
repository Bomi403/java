package chapter12_1;

public class Ex1 {
	public static void main(String[] args) {
		ThreeDPrinter pasticPrinter = new ThreeDPrinter();
		ThreeDPrinter powderPrinter = new ThreeDPrinter();
	
		pasticPrinter.addMaterial(new Plastic());
		powderPrinter.addMaterial(new Powder());
		
		
		Plastic plastic = (Plastic)pasticPrinter.getMaterial(); 
		plastic.doPrinting();
		
		Powder powder = (Powder)powderPrinter.getMaterial();
		powder.doPrinting();
		
		//System.out.println(pasticPrinter);
		//System.out.println(powderPrinter);
	}
}
