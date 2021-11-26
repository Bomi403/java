package chapter05_06;

public class Ex1 {
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
		
		person.age = 20;
		
		person2.age = 30;
		
		System.out.println("person : " + person.age);
		System.out.println("person2 : " + person2.age);
		
		Person person3 = person2;
		
		person3.age = 40;
		
		System.out.println("person2 : " + person2.age);
		
		System.out.println(person.sum(20, 30));
		System.out.println(person.sum(40, 50));
	}
}
