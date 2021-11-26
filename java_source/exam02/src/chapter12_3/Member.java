package chapter12_3;

import java.util.Comparator;

public class Member /* implements /* Comparable<Member> */ /* Comparator<Member> */ {
	
	private int memberId; // 회원아이디
	private String memberName; // 회원이름
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return "아이디 : " + memberId + ", 회원 이름 : " + memberName + ", 해시코드 : " + hashCode();
	}

	@Override
	public int hashCode() {
		/** 아이디가 동일하면 동일 인물 */
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		if (member.getMemberId() == memberId) {
			return true;
		} else {
			return false;
		}
		
	}

	/*
	 * @Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return o1.getMemberId() - o2.getMemberId();
	}
	*/
	/*
	@Override
	public int compareTo(Member o) {
	
		//return memberId - o.getMemberId(); // 오름차순(회원아이디)
		//return (memberId - o.getMemberId()) * -1; // 내림차순(회원아이디)
		
		//return memberName.compareTo(o.getMemberName()); // 회원명으로 오름차순
		return memberName.compareTo(o.getMemberName()) * -1; // 회원명으로 내림차순
	}
	*/
}
