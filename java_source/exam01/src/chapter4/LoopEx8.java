package chapter4;

public class LoopEx8 {
	public static void main(String[] args) {
		int i = 0;
		for ( ; ; ) {
			System.out.println(i);
			
			i++;
			
			if (i >= 5) 
				break;
		}
	}
}
