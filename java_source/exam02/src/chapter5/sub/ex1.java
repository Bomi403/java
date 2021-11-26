package chapter5.sub;

import chapter5.Person;

public class Ex1 {
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
		Person person3 = new Person("이름1", 178, 70);
		Person person4 = new Person("이름2");
		
		person3.showInfo();
		person4.showInfo();
		/**
		 *  main() -> JVM 호출  (1)
		 *  showInfo() -> main() -> showinfo(); (2)
		 *  
		 *  (2) showInfo() -> (1) main()
		 */
		person.showInfo();
		System.out.println(person);
		System.out.println(person2);
	}
}
