import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

	public static void  main(String[] args) {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int response;

		try {
			/*	Ask for an integer. If it's greater than 0, use the factorial function.
				If it's 0, Quit. If it's not an integer, Quit.
			*/
			do {
				System.out.print("Select an integer: ");
				response = Integer.parseInt(reader.readLine());
				
				if (response > 0) {
					int answer = factorial(response);
					System.out.println(answer);
				}
			}	
			while(response > 0);
		}
		catch(Exception e) {
			System.out.println("Non-integer selected. Quitting.");
		}
		
	}

	public static int factorial(int num) {
		
		// 	Base case is 1, returns 1
		if(num == 1) {
			return 1;
		}
		
		/* 	If not base case, return factorial of the number before it.
			The recursive calls will eventually reach the base case, which will return 1.
			It will then return 1*2, then (1*2)*3, then (1*2*3)*4 ... (1*2*...*(n-1))*n <-- n!
		*/
		else {
			return num * factorial(num - 1);
		}	
	}
}