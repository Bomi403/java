package chapter11_4;

public class Person {
	private int age;
	public String name;
	
	public Person() {
		this(0, "¾øÀ½");
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.printf("age : %d, name : %s%n", age, name);
	}
}
