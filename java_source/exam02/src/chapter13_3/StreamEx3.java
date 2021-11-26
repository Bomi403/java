package chapter13_3;

import java.util.ArrayList;

public class StreamEx3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1001, "이름1", 20));
		list.add(new Student(1002, "이름2", 22));
		list.add(new Student(1003, "이름3", 25));
		list.add(new Student(1004, "이름4", 32));
		
		
		//list.stream().forEach(s -> System.out.println(s.getName()));
		
		//list.stream().filter(s -> s.getAge() < 30).map(s -> s.getName()).forEach(s -> System.out.println(s));
		int age = list.stream().filter(s -> s.getAge() < 30).mapToInt(s -> s.getAge()).max().getAsInt();
		System.out.println(age);
	}
}
