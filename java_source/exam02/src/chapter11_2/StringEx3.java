package chapter11_2;

public class StringEx3 {
	public static void main(String[] args) {
		String fruit = new String("apple");
		System.out.println("fruit : " + System.identityHashCode(fruit));
		StringBuilder buffer = new StringBuilder(fruit);
		System.out.println("before buffer : " + System.identityHashCode(buffer));
		buffer.append(", melon");
		buffer.append(", mango");
		buffer.append(", banana");
		System.out.println("after buffer : " + System.identityHashCode(buffer));
		
		fruit = buffer.toString();
		System.out.println(fruit);
		System.out.println("fruit : " + System.identityHashCode(fruit));
	}
}
