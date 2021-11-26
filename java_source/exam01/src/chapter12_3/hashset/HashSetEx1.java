package chapter12_3.hashset;

import java.util.HashSet;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		list.add(new String("이름1"));
		list.add(new String("이름2"));
		list.add(new String("이름3"));
		list.add(new String("이름2"));
		
		for (String name : list) {
			System.out.println(name);
		}
	}
}
