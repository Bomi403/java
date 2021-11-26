package chapter8_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassEx2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<Person> cls = Person.class;
		//Person person = cls.newInstance();
		//System.out.println(person);
		//Class param = int.class;
		//Class param = String.class;
		Class[] param = {String.class, int.class};
		Constructor<Person> c = cls.getDeclaredConstructor(param);
		Person person = c.newInstance("¿Ã∏ß", 10);
		System.out.println(person);
	}
}
