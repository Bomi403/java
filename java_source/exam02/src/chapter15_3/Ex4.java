package chapter15_3;

import java.io.IOException;
import java.io.FileWriter;

public class Ex4 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("output3.txt")) {
			
			char[] chs = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
			
			fw.write("æ»≥Á«œººø‰.");
			fw.write(65);
			fw.write("65");
			fw.write(chs, 1, 3);
			fw.write("æ»≥Á«œººø‰", 1, 3);
			
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
