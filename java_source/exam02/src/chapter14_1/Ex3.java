package chapter14_1;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("test.java")) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ãâ·Â!");
	}
}
