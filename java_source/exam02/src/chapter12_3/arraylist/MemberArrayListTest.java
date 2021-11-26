package chapter12_3.arraylist;

import chapter12_3.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		Member mem1 = new Member(1001, "이름1");
		Member mem2 = new Member(1002, "이름2");
		Member mem3 = new Member(1003, "이름3");
		
		list.addMember(mem1);
		list.addMember(mem2);
		list.addMember(mem3);
		
		list.showMembers();
		System.out.println("----------------------------------------------");
		
		list.removeMember(1002);
		
		list.insertMember(3, new Member(1004, "이름4"));
		list.showMembers();
	}
}
