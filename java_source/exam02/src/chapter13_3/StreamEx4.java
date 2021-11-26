package chapter13_3;

import java.util.Arrays;

public class StreamEx4 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Arrays.stream(nums).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
	}
}
