package linkedList;

public class giftList {
	
	private Node head;
	
	
	

	public giftList() {
		super();
		head= null;
	}



	public boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}
	}
	
	
	public boolean addToBack( giftBasket listOfGifts) {
		if (isFull()) {
			return false;
		}else {
			Node nextItem = new Node();
			nextItem.setData(listOfGifts);
			if(isEmpty()) {
				head = nextItem;
			}else {
				Node current = head;
				while(current.getNext()!=null) {
					current = current.getNext();
				}
				current.setNext(nextItem);
			}
			return true;
		}
	}
	
	
	public giftBasket deleteFromFront() {
		if(!isEmpty()) {
			giftBasket data = head.getData();
			Node itemToDelete = head;
			head = head.getNext();
			itemToDelete = null;
			
			return head.getData();
		}
		return null;
	}
	
	
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			Node current = head;
			while(current != null) {
				current.getData().display();
				current = current.getNext();
			}
		}
	}
	
	
	public static void main(String[] args) {
		giftList list = new giftList();
		System.out.println("Adding gift Baskets");
		for (int i=1; i<4; i++) {
			giftBasket listOfGifts = new giftBasket(i, "ID"+i, i);
			list.addToBack(listOfGifts);
		}
		
		
		
		list.display();
		for(int i=1; i<4; i++) {
			giftBasket listOfGifts = list.deleteFromFront();
			System.out.println("Deleted :");
			listOfGifts.display();
		}
		list.display();
	

	}

}
