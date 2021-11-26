package chapter12_3.arraylist;

import chapter12_3.Member;

public class StackTest {
	public static void main(String[] args) {
		Stack<Member> stack = new Stack<>();
		stack.push(new Member(1001, "이름1"));
		stack.push(new Member(1002, "이름2"));
		stack.push(new Member(1003, "이름3"));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
