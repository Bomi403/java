package chapter04;

public class Ex10 {
	public static void main(String[] args) {
		int i = 1; // 1~9´Ü
		do {
			System.out.println("---- " + i + "´Ü -----");
			int j = 1;
			do {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			} while(j <= 9);
			i++;
		} while(i <= 9);
		
	}
}
