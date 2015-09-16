public class Queue {
	
	String queue[];
	int head;
	int tail;
	
	public Queue() {

		this.head = -1;
		this.tail = -1;
		this.queue = new String[10];
	
	}
	
	public void pop() {
		
		//if queue is empty
		if(this.isEmpty()) {
			System.out.println("Failed to pop - Queue is empty");
		}
		else {
			System.out.println("Popped: " + this.queue[head]);
			
			this.queue[head] = null;
			this.head = this.head + 1;

			//if queue empty now
			if(this.tail < this.head) {
				this.head = -1;
				this.tail = -1;
			}
		}
		printPoints();

	}

	public void push(String x) {

		//if queue is full
		if(this.isFull()) {
			System.out.println("Failed to push - Queue is full.");
		}
		else {
			//if queue is empty
			if(this.isEmpty()) {
				this.head = 0;
			}
			//if tail is at end of queue but not full
			else if(this.tail + 1 == this.queue.length) {
				int length = this.tail - this.head;
				for(int i = 0; i <= length; i++) {
					this.queue[i] = this.queue[this.head + i];
					this.tail = i;
				}
				this.head = 0;
			}
	
			this.tail = this.tail + 1;
			this.queue[tail] = x;
			System.out.println(x + " pushed");
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

	public void printPoints() {

		System.out.println("Head: " + Integer.toString(this.head) + ", Tail: " + Integer.toString(this.tail));
	}

	public boolean isFull() {
		return (this.tail - this.head + 1 == this.queue.length) ? true : false;
	}

	public boolean isEmpty() {
		return (this.head < 0 && this.tail < 0) ? true : false;	
	}

}
