public class Circular_Queue {

	String queue[];
	int head;
	int tail;

	public Circular_Queue() {

		this.head = -1;
		this.tail = -1;
		this.queue = new String[4];

	}

	public void pop() {
		if(this.isEmpty()) {
			System.out.println("Failed to pop - Queue is empty.");
		}
		else {
			System.out.println("Popped: " + this.queue[head]);
			this.queue[head] = null;

			if(this.head == this.tail) {
				this.head = -1;
				this.tail = -1;
			}
			else {
				this.head = this.head + 1;
				
				if(this.head == this.queue.length) {
					this.head = 0;
				}
			}
		}
		printPoints();
		
	}

	public void push(String x) {

		if(this.isFull()) {
			System.out.println("Failed to push - Queue is full.");
		}
		else {
			if(isEmpty()) {
				this.head = 0;
			}
			else if(this.tail + 1 == this.queue.length) {
				this.tail = -1;
			}
			this.tail = this.tail + 1;
			this.queue[tail] = x;
			System.out.println(x + " pushed.");
		}
		printPoints();	
	}

	public printLogical() {
		//print queue in order
		//add printPoints to this
	}

	public printPhysical() {
		//print the array
		//add printPoints to this
	}

	public String getName() {
		//use scanner to get name from line
		//remove parameter from push()
	}

	public boolean isFull() {
		int fullness = this.tail - this.head + 1;
		return (fullness == this.queue.length || fullness == 0) ? true : false;
	}

	public boolean isEmpty() {
		return (this.head < 0 && this.tail < 0) ? true : false;	
	}

	public void printPoints() {

		System.out.println("Head: " + Integer.toString(this.head) + ", Tail: " + Integer.toString(this.tail));
	}
}
