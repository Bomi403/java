package chapter09_1;

public class TeacherB extends Curriculum {
	@Override
	public void html() {
		System.out.println("B라는 방법으로 Html 강의");
	}

	@Override
	public void css() {
		System.out.println("B라는 방법으로 Css 강의");
		
	}

	@Override
	public void javascript() {
		System.out.println("B라는 방법으로 Javascript 강의");
		
	}

	@Override
	public void java() {
		System.out.println("B라는 방법으로 Java 강의");
		
	}

	@Override
	public void database() {
		System.out.println("B라는 방법으로 Database 강의");
		
	}
}
