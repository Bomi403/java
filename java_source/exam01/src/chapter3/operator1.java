package chapter3;

import chapter4.IfEx2;

public class operator1 {
	public static void main(String[] args) {
		int num = 10;
		num = -num;
		System.out.println(num); // 음수 -10
		num = -num;
		System.out.println(num); // 양수 10
	}
}
