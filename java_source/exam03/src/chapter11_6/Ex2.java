package chapter11_6;

import java.lang.reflect.*;

public class Ex2 {
	public static void main(String[] args) {
		Class cls = Book.class;
		Constructor[] cons = cls.getConstructors();
		System.out.println("---- 생성자 -----");
		for (Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println("---- 변수 ----");
		Field[] fields = cls.getFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("---- 메서드 ----");
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
} 
