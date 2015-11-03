public class LinkedList {
	
	Node head;
	Node tail;
	int size;
	

//	This initializes a linked list using an existing node.  
	public LinkedList(Node newNode){
		
		this.size = 0;
		this.addFirst(newNode);
		
	}
	
	public void addFirst(Node newNode) {
		if(this.size == 0) {
			this.head = newNode;
			this.tail = null;
		}
		else {
			newNode.setNext(this.head);
			this.head = newNode;
		}
			
		this.size = this.size + 1;
		newNode.printNode();
		System.out.println(" added to front.");
	}
	
	public void addLast(Node newNode) {
		if(this.size == 0) {
			this.addFirst(newNode);
		}
		else {
			if(this.size == 1) {
				this.tail = newNode;
				this.head.setNext(this.tail);
				this.size = this.size + 1;
			}
			else {
				this.tail.setNext(newNode);
				this.tail = newNode;
				this.size = this.size + 1;
			}
			newNode.printNode();
			System.out.println(" added to end.");		
		}		
	}

	public void removeFirst() {
		if( this.size == 0 ) {
			System.out.println("Cannot remove; list empty");
		}
		else {
			this.head = this.head.getNext();
			this.size = this.size - 1;

			if( this.size == 0 ){
				this.tail = null;
			}

			System.out.println("Head removed from list.");
		}
	}

	public void removeLast() {
		
		if(this.size == 0) { 
			System.out.println("Cannot remove last; list is empty"); 
		}
		else {
			if(this.size == 1) {
				this.removeFirst();
				this.head = null;
				this.tail = null;
			}
			else {
				Node curr = this.head;
				while( curr.getNext().getNext() != null) {
					curr = curr.getNext();
				}
				curr.setNext(null);
				this.size = this.size - 1;
				System.out.println("Tail removed from list.");
			}
		}		
	}
	
	public void printList() {
		if(this.size != 0) {
			Node curr = this.head;
			System.out.print("Size: " + Integer.toString(this.size) + " ===> ");
			do {
				curr.printNode();
				curr = curr.getNext();
				if( curr != null ) { 
					System.out.print(" -> "); 
				}
			} while( curr != null );
			System.out.println("\n");
		}
		else { System.out.println("List is empty\n"); }
	}
}

