package chapter12_2.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12_2.Member;

public class MemberHashSet {
	private HashSet<Member> members;
	
	public MemberHashSet() {
		members = new HashSet<Member>();
	}
	
	/** 회원 추가 */
	public void addMember(Member member) {
		members.add(member);
	}
	
	/** 회원 제거 */
	public boolean removeMember(int memberId) {
		/**
		 *  순서 X -> 인덱스 번호로 요소 접근 X 
		 *   인덱스 번호 가지고 반복 순회 X -> for(int i = 0;  X
		 *   향상된 for문, Iterator를 통해서 반복 순회
		 */
		/*
		for (Member member : members) {
			if (member.getMemberId() == memberId) {
				members.remove(member);
				return true;
			}
		}
		*/
		
		Iterator<Member> ir = members.iterator();
		/***
		 * hasNext() -> 다음 요소가 있는지 여부 체크(true, false) 
		 * next() -> 다음요소를 가져오는 메서드
		 */
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				members.remove(member);
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
