package chapter15_3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			/*
			fos.write(65);
			fos.write(66);
			fos.write(67);
			*/
			/*
			fos.write('A');
			fos.write('B');
			fos.write('C');
			*/
			char ch = 'A';
			byte[] bs = new byte[26];
			for(int i = 0; i < 26; i++) {
				bs[i] = (byte)ch;
				ch++;
			}
			fos.write(bs, 2, 10);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
