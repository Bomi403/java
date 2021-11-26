package chapter7_1;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[][] nums = new int[2][3];
		nums[0][0] = 10;
		nums[0][1] = 20;
		for (int i = 0; i < nums.length; i++) { // i번째 행
			for (int j = 0; j < nums[i].length; j++) { // i번째 행의 j번째 열
				System.out.println(nums[i][j]);
			}
		}
		
		/*
		int[][][] nums2 = new int[2][3][4];
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[i].length; j++) { 
				for (int k = 0; k < nums2[i][j].length; k++) {
					System.out.println(nums2[i][j][k]);
				}
			}
		}
		*/
	}
}
