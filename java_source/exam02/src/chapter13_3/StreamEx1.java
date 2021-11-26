package chapter13_3;

import java.util.stream.Stream;
import java.util.Arrays;

public class StreamEx1 {
	public static void main(String[] args) {
		Integer[] nums = { 0, 1, 2, 3, 4, 5, 6 };
		
		Stream<Integer> stream = Arrays.stream(nums);
		//stream.map(x -> x * x).forEach(x -> System.out.println(x));
		//long count = stream.map(x -> x * x).count();
		//System.out.println(count);
		//int sum = stream.mapToInt(x -> x * x).sum();
		//System.out.println(sum);
		
		int sum = stream.filter(x -> x < 4).mapToInt(x -> x).sum();
		System.out.println(sum);
		
		
		int sum2 = Arrays.stream(nums).mapToInt(x -> x).sum();
		System.out.println(sum2);
	}
}
