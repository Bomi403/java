package chapter5;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int children;
	
	 //public Person() {} // �⺻ �����ڰ� ������ �ν��Ͻ� ���� �Ұ� X
	// ������ �������Ҷ� �ڵ����� �߰� 
	
	public Person(int age, String name) { // ������ �Ű������� 2�� �� �Է��� ��� 
		this.age = age;
		this.name = name;
	}
	
	public Person(int age, String name, boolean isMarried, int children) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.children = children;
	}
	
	public void showInfo() {
		String isMarriedStr = isMarried?"��ȥ":"��ȥ";
		System.out.println("���� = " + age);
		System.out.println("�̸� = " + name);
		System.out.println("��ȥ ���� = " + isMarriedStr);
		System.out.println("�ڳ� �� = " + children);
	}
}