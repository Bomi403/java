package chapter15;

import java.io.*;

public class Ex1 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Á¦¸ñ1";
		book1.price = 15000;
		
		try(FileOutputStream fos = new FileOutputStream("book.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(book1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
