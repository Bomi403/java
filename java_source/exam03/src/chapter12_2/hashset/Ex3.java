package chapter12_2.hashset;

import java.util.TreeSet;
import chapter12_2.Member;

public class Ex3 {
	public static void main(String[] args) {
		
		/** 회원 이름으로 내림차순 정렬 */
		TreeSet<Member> list = new TreeSet<>();
		list.add(new Member(1002, "이름3"));
		list.add(new Member(1000, "이름4"));
		list.add(new Member(1001, "이름2"));
		list.add(new Member(1003, "이름1"));
		
		for(Member member : list) {
			System.out.println(member);
		}
	}
}
