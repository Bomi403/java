package chapter11;

public class Student {
	private int id; // 학번
	private String name; // 이름
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("아이디 : %d, 이름 : %s%n", id, name);
	}
	
	public int getId() {
		return id;
	}
	
	public boolean equals(Object obj) {
		return id == ((Student)obj).getId();
	}
	
	public int hashCode() {
		return id;
	}
	
	public String toString() {
		return "아이디 : " + id + ", 이름 : " + name;
	}
	
}
