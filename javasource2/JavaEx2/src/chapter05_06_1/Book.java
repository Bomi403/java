package chapter05_06_1;

public class Book implements Cloneable {
	public String title;
	public int price;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Book() {
		this("기본제목", 10000);
	}
	
	public Book(String title, int price)  {
		
		// Book 클래스로 인스턴스가 만들어 진 이후 -> this -> 현재 생성된 인스턴스의 주소
		this.title = title; // this.title -> 멤버 변수(힙),  title -> 지역변수(스택)
		this.price = price;
	}
	
	public void print() {
		System.out.printf("제목 : %s, 가격 : %d%n", this.title, this.price);
	}
}
