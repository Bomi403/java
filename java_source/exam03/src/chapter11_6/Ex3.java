package chapter11_6;

import java.lang.reflect.*;

public class Ex3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("chapter11_6.Book");
		Constructor<Book> c = cls.getDeclaredConstructor(String.class, int.class);
		Book book = c.newInstance("å1", 20000);
		System.out.println(book);
	}
}
