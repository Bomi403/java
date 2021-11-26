package chapter15_2;

import java.io.IOException;
import java.io.FileInputStream;

public class Ex2 {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				/*
				for (byte b : bs) {
					System.out.print((char)b);
				}
				*/
				for (int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : 읽은 바이트 수 - " + i);
			}
			/*
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
