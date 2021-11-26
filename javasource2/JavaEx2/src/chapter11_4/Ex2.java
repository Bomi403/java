package chapter11_4;

import java.lang.reflect.*;

public class Ex2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c = Person.class;
		Constructor<Person> con = c.getDeclaredConstructor();
		Person person = con.newInstance();
		person.showInfo();
		
		Person person2 = new Person();
	}
}
