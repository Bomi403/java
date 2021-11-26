package chapter15;

import java.io.*;

public class Ex4 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("student.obj");
			ObjectInputStream dis = new ObjectInputStream(fis)) {
			Student s1 = (Student)dis.readObject();
			System.out.printf("id=%d, name=%s", s1.getId(), s1.name);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
