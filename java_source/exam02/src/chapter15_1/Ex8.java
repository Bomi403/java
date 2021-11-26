package chapter15_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("문자 입력...");
		while(true) {
			char i = (char)isr.read();
			if (i == 'X' || i == 'x') {
				System.exit(0);
			}
			
			System.out.print(i);
		}
	}
}
