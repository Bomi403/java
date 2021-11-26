package chapter07;

public class Ex1 {
	static int num1;
	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
 		for (int i = 0; i < nums.length; i++) {
			System.out.printf("num[%d] = %d%n", i, nums[i]);
		}
		int[] nums2 = new int[6];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
 		nums2[3] = 40;
 		nums2[5] = 50;
 		
 		for (int i = 0; i < nums2.length; i++) {
			System.out.printf("num[%d] = %d%n", i, nums2[i]);
		}
		//System.out.println(nums[0]);
		
		
		//System.out.println("num1 : " + num1);
 		int[] num3;
 		num3 = new int[]{10, 20, 30, 40, 50 };
 		
	}
}
