package chapter10_7;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		/**
		 *  ArrayList 
		 * 		.remove(인덱스 번호) -> 제거되면 제거된 요소를 반환
		 * 	    .remove(인스턴스) -> 제거 되면 논리값(true, false)
		 *     .remove(인스턴스, 값) -> 제거되면 논리값(true, false)
		 */	
		return shelf.remove(0);
	}

}
