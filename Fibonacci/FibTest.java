import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibTest {
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String response;

		try {
			
			//	User selects "l" to choose a looped Fibonacci function or "r" for recursive
			//	As usual, it loops until the user "q"uits
			
			do {
				System.out.print("Please select an option (r/l/q): ");
				response = reader.readLine();
				switch(response) {
					case "l":	System.out.print("Enter an integer: ");
								response = reader.readLine();
								System.out.println(Fibonacci.fibLoop(Integer.parseInt(response)));
								System.out.println();
							break;
					case "r":	System.out.print("Enter an integer: ");
								response = reader.readLine();
								System.out.println(Fibonacci.fibRec(Integer.parseInt(response)));
								System.out.println();
							break;
					default: 
							break;
				}
			} while(!response.equals("q"));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}