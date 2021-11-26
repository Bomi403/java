package chapter11_3;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st1 = new Student(1000, "이름1");
		Student st2 = new Student(1000, "이름1");
		
		Student st3 = (Student)st2.clone(); // 깊은 복사 -> 새로운 인스턴스 생성 
		System.out.println("st2 : " + st2 + ", hashcode : " + System.identityHashCode(st2));
		System.out.println("st3 : " + st3 + ", hashcode : " + System.identityHashCode(st3));
		
		System.exit(0);
		System.out.println(st1 == st2); // false 
		System.out.println(st1.equals(st2)); // false --> Object.equals -> 인스턴스의 주소
		
		System.out.println("st1 : " + st1.hashCode());
		System.out.println("st2 : " + st2.hashCode());
		
		/*
		 *  집합 자료형
		 *    순서 X
		 *    중복 X 
		 */
		
		
		/*
		String text1 = new String("ABC");
		String text2 = new String("ABC");
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2)); // 논리적 동일성 -> 재정의
		
		System.out.println("text1 : " + text1.hashCode());
		System.out.println("text2 : " + text2.hashCode());
		*/
		/*
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2)); // true -> 재정의 -> 논리적 동일성
		
		System.out.println("i1 : " + i1.hashCode());
		System.out.println("i2 : " + i2.hashCode());
		*/
	}
}
