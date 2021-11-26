package chapter04;

public class Ex9 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 9) { // 1´Ü~9´Ü
			System.out.println("----- " + i + "´Ü -----");
			int j = 1;
			while (j <= 9) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
			i++;
		}
	}
}
