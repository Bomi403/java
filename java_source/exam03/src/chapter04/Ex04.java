package chapter04;

public class Ex04 {
	public static void main(String[] args) {
		String fruit = "Orange";
		switch (fruit) {
			case "Apple" :
				System.out.println("사과");
				break;
			case "mango" :
				System.out.println("망고");
				break;
			case "melon" : 
				System.out.println("멜론");
				break;
			default : 
				System.out.println("없는 과일 입니다.");
		}
	}
}
