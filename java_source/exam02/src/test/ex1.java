package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ex1 {
	public ex1() {
		System.out.println("test2");
	}
	
	public ex1(int i) {
		System.out.println("test");
	}
	
	public ex1(String name, int num) {
		System.out.println(name + "," + num);
	}
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<ex1> cls = ex1.class;
		Class[] params = new Class[2];
		params[0] = String.class;
		params[1] = int.class;
		Constructor<ex1> cons = cls.getDeclaredConstructor(params);
		ex1 e = cons.newInstance("test", 1);
		
	}
}
