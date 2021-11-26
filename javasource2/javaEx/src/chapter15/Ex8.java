package chapter15;

class Student4 {
	private String a;
	
	public Student4() {}
	
	public Student4(String a) {
		
	}
}

class Student3 extends Student4 {
	private String name;
	private int id;
	
	
	public Student3(String name, int id) {
		//super(name);
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "name = " + name + ", id = " + id;
	}
}

public class Ex8 {
	public static void main(String[] args) {
		Student3 s1 = new Student3("¿Ã∏ß1", 1000);
		System.out.println(s1);
		
		//Student3 s2 = new Student3();
	}
}
