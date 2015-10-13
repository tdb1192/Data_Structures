public class TestLinkedList {
	
	public static void main(String[] args) {
		
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		LinkedList link = new LinkedList(third);
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
