package chapter15_5;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentTest2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("student.obj");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			StudentList list = (StudentList)ois.readObject();
			list.showList();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
