package chapter04;

public class Ex02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		/*
		int min;
		if (num1 > num2) {
			min = num2;
		} else {
			min = num1;
		}
		*/
		int min = (num1 > num2)?num2:num1;
	}
}
