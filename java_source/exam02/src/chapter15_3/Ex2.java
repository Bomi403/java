package chapter15_3;

import java.io.IOException;
import java.io.FileReader;

public class Ex2 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("output2.txt")) {
			/**
			int i;
			while (( i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			*/
			
			char[] chs = new char[12];
			int i;
			while(( i = fr.read(chs)) != -1) {
				for (int j = 0; j < i; j++) {
					System.out.print(chs[j]);
				}
				
				System.out.println(" ¹®ÀÚ ¼ö : " + i);
			}
			
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}
