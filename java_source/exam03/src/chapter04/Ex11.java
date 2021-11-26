package chapter04;

public class Ex11 {
	public static void main(String[] args) {
		int[] nums = { 1, 2,3, 4, 5, 6 };
		
		for (int i = 0; i < nums.length; i++) {
			//System.out.println(nums[i]);
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
	}
}
