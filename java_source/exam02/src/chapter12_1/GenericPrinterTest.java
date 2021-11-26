package chapter12_1;

import java.util.ArrayList;

public class GenericPrinterTest {
	public static void main(String[] args) {
		Plastic plastic = new Plastic();
		Powder powder = new Powder();
		Water water = new Water();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(plastic);
		plasticPrinter.printing();
		//System.out.println(plasticPrinter);
		//Plastic plastic2 = plasticPrinter.getMaterial();
		
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(powder);
		powderPrinter.printing();
		//Powder powder2 = powderPrinter.getMaterial();
		//powder2.showInfo();
		/*
		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
		waterPrinter.setMaterial(water);
		*/
	}
}
