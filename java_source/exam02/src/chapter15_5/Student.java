package chapter15_5;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = -2992819229523443009L;
	
	private int studentID;
	private String name;
	transient private int age;
	
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + name + ", 나이 : " + age;
	}
}
