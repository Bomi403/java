package chapter12_3.arraylist;

import java.util.ArrayList;

/**
 *  enQueue -> 가장 끝에 추가 
 *  deQueue -> 가장 앞에서 부터 꺼내기
 */
public class Queue<T> {
	private ArrayList<T> dataList;
	
	public Queue() {
		dataList = new ArrayList<T>();
	}
	
	public void enQueue(T data) {
		dataList.add(data);
	}
	
	public T deQueue() {
		return dataList.remove(0);
	}
}
