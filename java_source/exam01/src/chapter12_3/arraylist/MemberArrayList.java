package chapter12_3.arraylist;

import java.util.ArrayList;
import chapter12_3.Member;
import java.util.Iterator;

/**
 * arrayList - 추가, 삭제, 출력 
 *
 */
public class MemberArrayList {
	private ArrayList<Member> memberList;
	
	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	/** 회원 추가 */
	public void addMember(Member member) {
		if (member != null) {
			memberList.add(member);
		}
	}
	
	/** 특정 위치에서 회원 추가 */
	public void insertMember(int index, Member member) {
		if (member != null && index >= 0 && index <= memberList.size()) {
			memberList.add(index, member);
		}
	}
	
	/** 회원 삭제 */
	public boolean removeMember(int memberId) {
		// get -> ArrayList -> 요소를 조회
		Iterator<Member> ir = memberList.iterator();
		while(ir.hasNext()) { // 다음 요소가 있으면 true
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				memberList.remove(member);
				return true;
			}
		}
		/*
		for(int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (member.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}
		*/
		return false;
	}
	
	/** 회원목록 출력 */
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
