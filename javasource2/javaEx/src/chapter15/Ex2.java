package chapter15;

import java.io.*;

public class Ex2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("book.obj");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			Book book1 = (Book)ois.readObject();
			System.out.printf("title=%s, price=%d", book1.title, book1.price);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
