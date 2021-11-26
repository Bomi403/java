package chapter15_1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.println("문자를 입력하시오...");
		while((i = br.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
