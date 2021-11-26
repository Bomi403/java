package chapter8_2;

public class ClassEx1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String text = new String("ABC");
		Class c1 = text.getClass();
		
		Class c2 = String.class;
		
		Class c3 = Class.forName("java.lang.String");
		
	}
}
