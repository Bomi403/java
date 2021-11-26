package chapter15_5;

import java.util.ArrayList;
import java.io.Serializable;

public class StudentList implements Serializable {
	
	private static final long serialVersionUID = -94907836795831647L;

	private ArrayList<Student> list;
	
	private String name5;
	private int num;
	
	public StudentList() {
		list = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		list.add(s);
	}
	
	public void showList() {
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
