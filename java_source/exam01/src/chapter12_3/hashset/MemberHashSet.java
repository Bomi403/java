package chapter12_3.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12_3.Member;

/**
 * 추가, 삭제, 조회
 */
public class MemberHashSet {
	private HashSet<Member> memberList;
	
	public MemberHashSet() {
		memberList = new HashSet<Member>();
	}
	
	/** 추가 */
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	/** 삭제 */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = memberList.iterator();
		/**
		 * hasNext() -> 다음 요소가 있는지 여부 체크 
		 * next() -> 다음 요소를 가져오는 메서드
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
	
	/** 출력 */
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
