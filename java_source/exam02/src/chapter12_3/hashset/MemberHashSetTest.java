package chapter12_3.hashset;

import chapter12_3.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet list = new MemberHashSet();
		list.addMember(new Member(1002, "이름2"));
		list.addMember(new Member(1001, "이름1"));
		list.addMember(new Member(1003, "이름3"));
		list.addMember(new Member(1002, "이름2"));
		list.addMember(new Member(1002, "이름4"));
		
		list.showMembers();
	}
}
