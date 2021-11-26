package chapter7_1;

import java.util.ArrayList;

public class Ex5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // 10개의 배열 공간 -> 자동 증가
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");
		list.add("JKL");
		
		System.out.println("요소의 갯수 : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (String text : list) {
			System.out.println(text);
		}
		
		/*
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println("----------------------------");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		*/
		
	}
}
