package chapter07;

import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		String fruits = "apple,orange,melon";
		StringTokenizer st = new StringTokenizer(fruits, ",");
		while(st.hasMoreTokens()) {
			String fruit = st.nextToken();
			System.out.println(fruit);
		}
		
	}
}
