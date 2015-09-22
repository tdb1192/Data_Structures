public class Circular_Queue_Test {	
	public static void main( String[] args ) {
		Circular_Queue q = new Circular_Queue();

		//This test will fill the queue, then remove some names from it
		//Then it will overfill the queue, and circle around
		//Lastly, it will empty the queue, and try to empty too many names
		q.push();	//h=0, t=0
		q.push();	//h=0, t=1
		q.push();	//h=0, t=2
		q.push();	//h=0, t=3 -- queue is full
		q.pop();	//h=1, t=3 
		q.pop();	//h=2, t=3
		q.push();	//h=2, t=0
		q.push();	//h=2, t=1 -- queue is full
		q.push();	//h=2, t=1 -- queue is full
		q.pop();	//h=3, t=1
		q.pop();	//h=0, t=1
		q.pop();	//h=1, t=1
		q.pop();	//h=-1, t=-1 --queue is empty
		q.pop();	//h=-1, t=-1 --queue is empty
	}
}
