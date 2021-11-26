package chapter11_3;

import java.util.Objects;

public class Ex2 {
	public static void main(String[] args) {
		int[] nums1 = {0,1,2,3,4};
		int[] nums2 = {0,1,2,3,4};
		System.out.println(nums1 == nums2);
		System.out.println(nums1.equals(nums2));
		
		System.out.println(Objects.deepEquals(nums1, nums2));
	}
}
