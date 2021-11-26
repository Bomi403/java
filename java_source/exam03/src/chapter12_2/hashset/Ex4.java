package chapter12_2.hashset;

import java.util.TreeSet;
import java.util.Comparator;

public class Ex4 {
	public static void main(String[] args) {
		/** 내림차순으로 정렬 하시오.. */
		/*
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
			
		};
		*/
		TreeSet<Integer> list = new TreeSet<>((Integer o1, Integer o2) -> o1.compareTo(o2) * -1);
		/**
		 * Integer -> 정렬의 기준 정의 되어 있다(오름차순)
		 */
		list.add(Integer.valueOf(200));
		list.add(Integer.valueOf(100));
		list.add(Integer.valueOf(300));
		list.add(Integer.valueOf(400));
		
		for(Integer num : list) {
			System.out.println(num);
		}
	}
}
