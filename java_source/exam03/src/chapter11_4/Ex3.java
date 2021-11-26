package chapter11_4;

public class Ex3 {
	public static void main(String[] args) {
		String text = "AB";
		System.out.println("text : " + System.identityHashCode(text));
		
		StringBuilder sb = new StringBuilder(text);
		System.out.println("sb1 : " + System.identityHashCode(sb));
		
		sb.append("CD");
		System.out.println("sb2 : " + System.identityHashCode(sb));
		
		sb.append("EF");
		System.out.println("sb3 : " + System.identityHashCode(sb));
		
		sb.append("GH");
		System.out.println("sb4 : " + System.identityHashCode(sb));
		
		text = sb.toString();
		System.out.println("text : " + System.identityHashCode(text));
		System.out.println(text);
	}
}
