package chapter15_3;

import java.io.IOException;
import java.io.FileInputStream;

public class Ex3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("output.txt")) {
			byte[] bs = new byte[26];
			fis.read(bs, 2, 10);
			for (byte b : bs) {
				if (b == 0) continue;
				System.out.print((char)b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
