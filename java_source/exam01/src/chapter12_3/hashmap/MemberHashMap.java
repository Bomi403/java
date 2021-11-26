package chapter12_3.hashmap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import chapter12_3.Member;

/* 추가, 삭제, 조회 */
public class MemberHashMap {
	private HashMap<Integer, String> memberList;
	
	public MemberHashMap() {
		memberList = new HashMap<Integer, String>();
	}
	
	/** 추가 */
	public void addMember(Member member) {
		memberList.put(member.getMemberId(), member.getMemberName());
	}
	
	/** 제거 */
	public boolean removeMember(int memberId) {
		if (memberList.containsKey(memberId)) {
			memberList.remove(memberId);
			return true;
		} else {
			return false;
		}
	}
	
	/** 출력 */
	public void showMembers() {
		Set<Integer> set = memberList.keySet();
		Iterator<Integer> ir = set.iterator();
		while(ir.hasNext()) {
			int memId = ir.next();  // 회원 아이디
			String memNm = memberList.get(memId);
			System.out.println("아이디 : " + memId + ", 회원 이름 : " + memNm);
		}
	}
}
