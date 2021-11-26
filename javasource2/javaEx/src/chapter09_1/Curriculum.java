package chapter09_1;

public abstract class Curriculum {
	public abstract void html();
	public abstract void css();
	public abstract void javascript();
	public abstract void java();
	public abstract void database();
	
	public void hired() {
		System.out.println("ร๋พ๗ ตส");
	}
	
	final public void lecture() {
		html();
		css();
		javascript();
		java();
		database();
		hired();
	}
}
