package chapter12_3.arraylist;

import java.util.ArrayList;
/** 
 *  추가 - 가장 끝에 추가 
 *  꺼내기 - pop -> 가장 최근에 추가된 요소 
 */
public class Stack<T> {
	private ArrayList<T> dataList;
	
	public Stack() {
		dataList = new ArrayList<T>();
	}
	
	public void push(T data) {
		dataList.add(data);
	}
	
	public T pop() {
		int len = dataList.size() - 1;
		
		return dataList.remove(len);
	}
}
