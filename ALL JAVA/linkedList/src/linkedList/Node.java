package linkedList;

public class Node {
	private giftBasket data;
	private Node next;
	
	
	public Node() {
		super();
		this.data= new giftBasket();
		this.next= null;
	}


	public Node(giftBasket data) {
		super();
		this.data = data;
	}


	public Node(giftBasket data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}


	public giftBasket getData() {
		return data;
	}


	public void setData(giftBasket data) {
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


