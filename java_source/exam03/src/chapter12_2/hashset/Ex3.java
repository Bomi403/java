package chapter12_2.hashset;

import java.util.TreeSet;
import chapter12_2.Member;

public class Ex3 {
	public static void main(String[] args) {
		
		/** ȸ�� �̸����� �������� ���� */
		TreeSet<Member> list = new TreeSet<>();
		list.add(new Member(1002, "�̸�3"));
		list.add(new Member(1000, "�̸�4"));
		list.add(new Member(1001, "�̸�2"));
		list.add(new Member(1003, "�̸�1"));
		
		for(Member member : list) {
			System.out.println(member);
		}
	}
}