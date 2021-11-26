package chapter5;

public class Person2 {
	private String name;
	
	public Person2() {
		 // name -> 이름없음
		//this.name = "이름2"; 
		this("이름없음");
		this.name = "이름2";
		/**
		 * 멤버변수(인스턴스 변수)에 값을 지정 
		 *  -> 인스턴스가 먼저 생성 -> 멤버변수의 자료형에 맞게 힙 공간이 생성 -> 값을 대입
		 *  멤버변수에 값을 대입 -> 생성 (X)
		 */
	}
	
	public Person2(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(name);
	}
	
	public Person2 returnThis() {
		return this;
	}
	
	public static void main(String[] args) {
		Person2 person2 = new Person2(); // 이름 -> 기본값으로 - 이름없음
		Person2 person = new Person2("이름1");
		Person2 person3 = person.returnThis();
		person.showInfo();
		person3.showInfo();
	}
}
