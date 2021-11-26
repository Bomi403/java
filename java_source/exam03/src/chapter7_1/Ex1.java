package chapter7_1;

public class Ex1 {
	public static void main(String[] args) {
		/*
		int[] nums = new int[4];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		*/
		/*
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		*/
		
		//int[] nums = new int[] {10, 20, 30, 40, 50};
		//int[] nums = {10, 20, 30, 40, 50};
		int[] nums;
		//nums = { 10, 20, 30, 40, 50 };
		nums = new int[] { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
}
