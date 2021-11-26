package chapter12_2.hashset;

import chapter12_2.Member;

public class MemberHasSetTest {
	public static void main(String[] args) {
		MemberHashSet list = new MemberHashSet();
		list.addMember(new Member(1000, "이름1"));
		list.addMember(new Member(1001, "이름2"));
		list.addMember(new Member(1002, "이름3"));
		list.addMember(new Member(1000, "이름1"));
		
		list.showMembers();
	}
}
