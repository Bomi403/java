package chapter12_2.treemap;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Comparator;

public class Ex1 {
	public static void main(String[] args) {
		/**
		 * Integer - 정렬의 기준이 이미 정의(Comparable - compareTo)
		 * 			  - 내림차순
		 *           - final 클래스 - 상속 불가, compareTo 재정의 불가
		 *           - java.util.Comparator, int compare
		 *           @Functional Interface -> 람다식
		 */
		
		Comparator<Integer> com = new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
		};
		
		
		//TreeMap<Integer, String> list = new TreeMap<>(com);
		TreeMap<Integer, String> list = new TreeMap<>((Integer o1, Integer o2) -> o1.compareTo(o2) * -1);
		list.put(1002, "이름3");
		list.put(1000, "이름1");
		list.put(1001, "이름2");
		list.put(1003, "이름4");
		
		Iterator<Integer> ir = list.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			String value = list.get(key);
			System.out.println("아이디 : " + key + ", 이름 : " + value);
		}
		
	}
}
