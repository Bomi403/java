package chapter12_3.linkedlist;

import chapter12_3.Member;

public class MemberLinkedListTest {
	public static void main(String[] args) {
		MemberLinkedList list = new MemberLinkedList();
		
		list.addMember(new Member(1001, "이름1"));
		list.addMember(new Member(1002, "이름2"));
		list.addMember(new Member(1003, "이름3"));
		
		list.showMembers();
		System.out.println();
		
		list.removeMember(1002);
		
		list.showMembers();
		System.out.println();
		
		list.insertFirst(new Member(1004, "이름4"));
		list.showMembers();
	}
}
