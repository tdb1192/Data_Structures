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

	//Removes an item from the beginning of the queue
	public void pop() {

		//Check if empty, if so, show message and quit.
		if(this.isEmpty()) {
			System.out.println("Failed to pop - Queue is empty.");
		}
		else {
			//Print the item and remove it from the queue
			System.out.println("Popped: " + this.queue[head]);
			this.queue[head] = null;
			
			//If there was one item in the list, it's now empty.
			if(this.head == this.tail) {
				this.head = -1;
				this.tail = -1;
			}
			
			//If there was more than one item, move the head forward
			else {
				this.head = this.head + 1;
				
				if(this.head == this.queue.length) {
					this.head = 0;
				}
			}
		}

		System.out.println();
		
	}

	//Adds an item to the end of the queue
	public void push() {
		
		//Check if empty, if so, show message and quit
		if(this.isFull()) {
			System.out.println("Failed to push - Queue is full.");
		}
		else {
			
			//Get a name from user input
			String x;
			x = getName();
			
			//If the queue is empty, set the head at 0, and tail is already set to -1
			if(isEmpty()) {
				this.head = 0;
			}
			
			//If the tail is at the end of the array, move it to -1 so it can shift to 0 later
			else if(this.tail + 1 == this.queue.length) {
				this.tail = -1;
			}

			//Move the tail one spot, add the new item, and print a success message
			this.tail = this.tail + 1;
			this.queue[tail] = x;
			System.out.println(x + " pushed.");
		}

		System.out.println();
	}


	//print the queue in logical order
	public void printLogical() {

		System.out.print("Logical view of the queue: ");
		
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}

		else {
			
			//If queue hasn't circled, just print the array items in order from head to tail
			if(this.head <= this.tail) {
				for(int i = this.head; i <= this.tail; i++) {
					System.out.print(this.queue[i] + " ");
				}
			}

			//If the queue has circled, first print from head to the end of the array
			//Then print from the beginning to the tail
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
			System.out.println();
		}				
	}

	//print the queue array
	public void printPhysical() {

		System.out.print("Physical view of the queue: ");

		//print the entire array, including null spaces
		for(int i = 0; i < this.queue.length; i++) {
			System.out.print(this.queue[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	//Ask for a name and return it
	public String getName() {

		//Create a BuffereReader asking the user for a name
		//Catch any exceptions and show an error
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
	

	//Checks if the Queue is full; returns true if full
	public boolean isFull() {
		int fullness = this.tail - this.head + 1;
		return (fullness == this.queue.length || fullness == 0) ? true : false;
	}

	//Checks if the Queue is empty; returns true if empty
	public boolean isEmpty() {
		return (this.head < 0 && this.tail < 0) ? true : false;	
	}

	//Prints out the head and tail array locations
	public void printPoints() {

		System.out.println("Head: " + Integer.toString(this.head) + ", Tail: " + Integer.toString(this.tail));
	}
}
