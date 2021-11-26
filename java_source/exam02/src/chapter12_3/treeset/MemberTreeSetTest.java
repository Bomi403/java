package chapter12_3.treeset;

import chapter12_3.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet list = new MemberTreeSet();
		list.addMember(new Member(1003, "이름3"));
		list.addMember(new Member(1001, "이름2"));
		list.addMember(new Member(1004, "이름4"));
		list.addMember(new Member(1002, "이름1"));	
		list.addMember(new Member(1001, "이름2"));
		
		list.showMembers();
	}
}
