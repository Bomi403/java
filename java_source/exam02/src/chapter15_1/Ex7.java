package chapter15_1;

import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) throws IOException {
		System.out.println("문자 입력");
		/*
		int i = System.in.read(); // unsigned byte 0~255
		System.out.println((char)i);
		*/
		
		while(true) {
			char i = (char)System.in.read(); // InputStream -> 1byte
			if (i == 'X' || i == 'x') {
				System.exit(0);
			}
			System.out.print(i);
		}
		
	}
}
