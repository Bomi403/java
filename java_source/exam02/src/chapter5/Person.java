package chapter5;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	FamilyMember family;
	java.util.ArrayList<String> list;

	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	
	public void showInfo() {
		//System.out.println("Person 클래스");
		System.out.println(name + "님 키 : " + height + ", 몸무게 : " + weight);
	}
	
	/**
	 * 
	 * 변수 num1, num2, result --> 함수 내에 정의 
	 */
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
