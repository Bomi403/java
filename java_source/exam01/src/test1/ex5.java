package test1;

public class ex5 {
	public static void main(String[] args) {
		int dan;
		int i;
		
		for (dan = 2; dan <= 9; dan++) {
		for (i = 1;; i++) {
			if(i <= dan)
			break;
		}
		System.out.println( dan + " X " + i + " = " + dan * i);
		}
		System.out.println();
	}
}
