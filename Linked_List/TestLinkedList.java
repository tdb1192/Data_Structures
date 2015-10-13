public class TestLinkedList {
	
	public static void main(String[] args) {
		
		Node first = new Node("A");
		Node second = new Node("B");
		Node third = new Node("C");
		Node fourth = new Node("D");
		Node fifth = new Node("E");

		LinkedList link = new LinkedList(third);
			link.printList();	
		link.removeFirst();		
			link.printList();	
		link.addLast(third);
			link.printList(); 	
		link.removeLast();
			link.printList();	
		link.addFirst(third);
			link.printList();	
		link.addLast(fourth);
			link.printList();	
		link.addFirst(second);
			link.printList();	
		link.addFirst(first);
			link.printList();	
		link.addLast(fifth);
			link.printList();	
		link.removeFirst();
			link.printList();	
		link.removeLast();
			link.printList();	
		link.removeLast();
			link.printList();	
		link.removeFirst();	
			link.printList();	
	}
	
}
