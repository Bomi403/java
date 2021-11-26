package chapter11_4;

import java.lang.reflect.*;

public class Ex3 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c = Person.class;
		Constructor<Person> con =  c.getDeclaredConstructor(int.class, String.class);
		Person person = con.newInstance(40, "¿Ã∏ß1");
		person.showInfo();
	}
}
