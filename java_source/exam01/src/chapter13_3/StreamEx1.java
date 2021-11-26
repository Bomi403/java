package chapter13_3;

import java.util.stream.Stream;
import java.util.Arrays;

public class StreamEx1 {
	public static void main(String[] args) {
		Integer[] nums = {0, 1, 2, 3, 4, 5, 6,};
		
		Stream<Integer> stream = Arrays.stream(nums);
		stream.map(x -> x * x).forEach(x -> System.out.println(x));
		
	}
}
