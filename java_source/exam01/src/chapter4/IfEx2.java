package chapter4;

class IfExSub {
	
}

public class IfEx2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		/*
		int max;
		if (a > b)
			max = a;
		else 
			max = b;
		*/
		int max = (a > b)?a:b;
		System.out.println(max);
	}
}
