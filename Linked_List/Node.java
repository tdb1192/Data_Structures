public class Node {
	
	Object data;
	Node next;
	
	public Node(Object d) {
		this.data = d;
		this.next = null;
	}
	
	public Node(Object d, Node n) {
		this.data = d;
		this.next = n;
	}

	public void printNode() {
		System.out.print(this.data.toString());
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public Object getData() {
		return this.data;
	}

}
