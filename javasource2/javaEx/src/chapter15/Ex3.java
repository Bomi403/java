package chapter15;

import java.io.*;

public class Ex3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 20001425;
		s1.name = "¿Ã∏ß1";
		try(FileOutputStream fos = new FileOutputStream("student.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
