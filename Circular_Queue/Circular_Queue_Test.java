import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Circular_Queue_Test {	
	public static void main( String[] args ) {
		
		Circular_Queue q = new Circular_Queue();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String response;

		try {
			
			do {
				
				// Bases which operation to do on user input
				System.out.print("Please select an option: ");
				response = reader.readLine();
				switch(response) {
					case "i": 	q.push();
							break;
					case "d":	q.pop();
							break;
					case "p":	q.printPhysical();
							break;
					case "l":	q.printLogical();
							break;
					case "q":
							break;
							
					// Gives help message when user enters invalid option
					default:	System.out.println("Options are i/d/p/l/q");
								System.out.println();
							break;	
				}
			}
			
			// Quits when user enters "q"
			while(!response.equals("q"));

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
