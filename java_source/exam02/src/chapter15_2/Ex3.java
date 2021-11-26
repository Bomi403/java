package chapter15_2;

import java.io.IOException;
import java.io.FileInputStream;

public class Ex3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			byte[] bs = new byte[26];
			int i = fis.read(bs, 4, 10);
			for (int j = 0; j < i; j++) {
				System.out.print((char)bs[j]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
