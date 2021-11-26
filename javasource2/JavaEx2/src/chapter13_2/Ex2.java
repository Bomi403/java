package chapter13_2;

import java.util.*;

interface PreInter<E> {
	boolean test(E el, int index);
}

public class Ex2 {
	public static void main(String[] args) {
		int[] list = {0, 1,2,3,4,5,6,7,8,9,10};
	
		ArrayList<Integer> nums = filter(list, (el, i)-> {
			if (el % 2 == 0) 
				return true;
			return false;
		});
		
		System.out.println(nums)
		
	}
	
	public static ArrayList<Integer> filter(int[] list, PreInter<Integer> inter) {
		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			if (inter.test(list[i], i)) {
				data.add(list[i]);
			}
		}
		
		return data;
	}
}
