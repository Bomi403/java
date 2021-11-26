package chapter14_2;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) throws IOException {
		try {
			int num1 = 100;
			int num2 = 0;
		System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			//e.printStackTrace(new PrintWriter(new FileWriter("log.txt")));
			e.printStackTrace();
		}
		
		System.out.println("실행되나요?");
	}
}
