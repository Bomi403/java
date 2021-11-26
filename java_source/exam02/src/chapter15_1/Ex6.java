package chapter15_1;

import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력하시오. : ");
		while (true) {
			String text = scanner.nextLine();
			System.out.println(text);
		}
	}
}
