package chapter15_2;

import java.io.IOException;
import java.io.FileInputStream;

/***
 *  스트림 열고 -> 끝나면 반드시 닫아 한다 close();
 *
 */
public class Ex1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			/*
			int i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println(i);
			*/
			int i;
			while(( i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis == null) {
				try {
				fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
