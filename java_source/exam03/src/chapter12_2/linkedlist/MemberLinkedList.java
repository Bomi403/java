package chapter12_2.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;
import chapter12_2.Member;

public class MemberLinkedList {
	private LinkedList<Member> members; 
	
	public MemberLinkedList() {
		members = new LinkedList<Member>();
	}
	
	/** 회원 추가 */
	public void addMember(Member member) {
		members.add(member);
	}
	
	/** 마지막 회원 제거 */
	public void popMember() {
		members.pop();
	}
	
	/** 회원 제거 */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = members.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				members.remove(member);
				return true;
			}
		}
		return false;
	}
	
	/** 회원 출력 */
	public void showMembers() {
		for (Member member : members) {
			System.out.println(member);
		}
	}
}
