package chapter12_3.treeset;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<>();
		list.add(new String("이름1"));
		list.add(new String("이름2"));
		list.add(new String("이름3"));
		list.add(new String("이름4"));
		
		for (String name : list) {
			System.out.println(name);
		}
	}
}
