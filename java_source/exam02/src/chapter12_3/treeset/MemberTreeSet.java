package chapter12_3.treeset;

import java.util.TreeSet;
import java.util.Iterator;
import chapter12_3.Member;

/**
 *  추가, 삭제, 조회
 */
public class MemberTreeSet {
	private TreeSet<Member> memberList;
	
	public MemberTreeSet() {
		memberList = new TreeSet<Member>(new Member());
	}
	
	/** 추가 */
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	/** 삭제 */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = memberList.iterator();
		/**
		 * hasNext() 
		 * next()
		 */
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				memberList.remove(member);
				return true;
			}
		}
		
		return false;
	}
	
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
