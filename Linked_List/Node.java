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
		System.out.println(this.data.toString());
	}
}