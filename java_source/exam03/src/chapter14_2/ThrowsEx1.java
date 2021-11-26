package chapter14_2;

public class ThrowsEx1 {
	public void method() {
		/** 
		 * 외부에서는 예외가 발생 했는지 알 수 X 
		 * 메서드가 독립적으로 동작 -> 문제 X 
		 * 다른 메서드에서 호출이 자주 되고 각각 실행되는 문맥이 다를 경우
		 * 예외도 각각 다르게 처리
		 * */
		
		try {
			Class.forName("chapter14_2.ResourceEx2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  method2()를 호출하는 쪽에서 ClassNotFoundException을 처리하도록 전가
	 * 
	 */
	public void method2() throws ClassNotFoundException {
		Class.forName("chapter14_2.ResourceEx2");
	}
	
}
