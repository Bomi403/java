package chapter12_3;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름2");
		
		System.out.println(list);
	}
}
