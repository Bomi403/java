package chapter03;

public class Ex05 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 40;
		String text = (fatherAge > motherAge)?"아빠가 엄마보다 나이가 많습니다.":"엄마가 아빠보다 나이가 많습니다.";
		System.out.println(text);
	}
}
