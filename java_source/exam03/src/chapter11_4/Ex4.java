package chapter11_4;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		String text = glue("#", "Apple", "Orange", "Mango", "Melon");
		System.out.println(text);
	}
	
	public static String glue(String separator, String... texts) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < texts.length; i++) {
			if (i > 0) sb.append(separator);
			sb.append(texts[i]);
		}
		
		return sb.toString();
	}
}
