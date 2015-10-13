public class LinkedList {
	
	Node head;
	Node tail;
	int size;
	
	public LinkedList(Node newNode){
		
		this.head = newNode;
		this.tail = newNode;
		this.size = 1;
		
	}
	
	public void addFirst(Node newNode) {
		newNode.setNext(this.head);
		this.head = newNode;
		this.size = this.size + 1;
	}
	
	public void addLast(Node newNode) {
		this.tail.setNext(newNode);
		this.tail = newNode;
		this.size = this.size + 1;	
	}

	public void removeFirst() {
		this.head = this.head.getNext();
		this.size = this.size - 1;

		if( this.size == 0 ){
			this.tail = null;
		}
	}

	public void removeLast() {
		
		if(this.size == 1) {
			this.removeFirst();
		}
		else {
			Node curr = this.head;
			while( curr.getNext().getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(null);
		}		
	}
	
	public void printList() {
		if(this.head != null) {
			Node curr = this.head;
			do {
				curr.printNode();
				curr = curr.getNext();
				if( curr != null ) { System.out.print(" -> "); }
			} while( curr != null );
			System.out.println();
		}
		else { System.out.println("List is empty"); }
	}

}

