package chapter14_2;

import java.io.*;

public class Ex3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("a.txt");
			  InputStreamReader isr = new InputStreamReader(fis);
			  BufferedReader br = new BufferedReader(isr)) {
			int ch;
			  while((ch = br.read()) != -1) {
				  System.out.println((char)ch);
			  }
			
		} catch (IOException e) {
			
		}
	}
}
