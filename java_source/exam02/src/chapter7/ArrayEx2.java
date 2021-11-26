package chapter7;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] nums = new int[4]; // int 자료형 빈 공간 4개
		
		int size = 0;
		nums[0] = 10; size++;
		nums[1] = 20; size++;
		nums[2] = 30; size++;
		nums[3] = 40; size++;
		nums[4] = 50; size++;
		
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]);
		}
	}
}
