package chapter15_4;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("output2.txt");
			InputStreamReader isr = new InputStreamReader(fis)) {
			int i;
			while (( i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
