package chapter15_5;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	public static void main(String[] args) {
		StudentList list1 = new StudentList();
		
		list1.addStudent(new Student(1001, "이름1", 30));
		list1.addStudent(new Student(1002, "이름2", 40));
		list1.addStudent(new Student(1003, "이름3", 20));
		
		try (FileOutputStream fos = new FileOutputStream("student.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("student.obj");	
			ObjectInputStream ois = new ObjectInputStream(fis))  {
			
			oos.writeObject(list1);
			
			StudentList list2 = (StudentList)ois.readObject();
			list2.addStudent(new Student(1004, "이름4", 25));
			list2.addStudent(new Student(1005, "이름5", 50));
			
			oos.writeObject(list2);
			
			StudentList list3 = (StudentList)ois.readObject();
			list3.showList();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
