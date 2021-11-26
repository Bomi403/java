package chapter12_2.arraylist;

import java.util.ArrayList;
import chapter12_2.Member;

public class MemberArrayList {
	
	private ArrayList<Member> members;
	
	public MemberArrayList() {
		members = new ArrayList<Member>();
	}
	
	/** 회원 추가 */
	public void addMember(Member member) { // add
		members.add(member);
	}
	
	/** 회원 제거 */
	public boolean removeMember(int memberId) { 
		// .size() -> 요소의 갯수, .get(index 번호)
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.getMemberId() == memberId) {
				 // remove
				members.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/** 회원 조회 */
	public void showMembers() {
		for (Member member : members) {
			System.out.println(member);
		}
	}
}
