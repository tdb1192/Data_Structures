import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		printPhysical();
		printLogical();
		System.out.println();
		
	}

	public void push() {

		if(this.isFull()) {
			System.out.println("Failed to push - Queue is full.");
		}
		else {
			String x;
			x = getName();

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
		printPhysical();
		printLogical();
		System.out.println();
	}

	public void printLogical() {

		//print queue in order
		System.out.print("Logical view of the queue: ");
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			if(this.head <= this.tail) {
				for(int i = this.head; i <= this.tail; i++) {
					System.out.print(this.queue[i] + " ");
				}
			}
			else {
				int end = this.queue.length;
				for(int i = this.head; i < end; i++) {
					System.out.print(this.queue[i] + " ");
				}
				for(int i = 0; i <= this.tail; i++) {
					System.out.print(this.queue[i] + " ");
				}			
			}
			System.out.println();
		}				
	}

	public void printPhysical() {
		//print the array
		System.out.print("Physical view of the queue: ");
		for(int i = 0; i < this.queue.length; i++) {
			System.out.print(this.queue[i] + " ");
		}
		System.out.println();
	}

	public String getName() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String response;
		System.out.print("Please enter a name: ");
	
		try {
			response = reader.readLine();
			return response;

		}
		catch(Exception e) {
			System.out.println(e);
		}

		return null;
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
