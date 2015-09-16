import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DivideByTwo {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int chosenNumber;
		String input;
		
		System.out.println("Please enter an integer: ");
	
		try {
			
			input = reader.readLine();
			chosenNumber = Integer.parseInt(input);
		System.out.println("Half of " + chosenNumber + " is " + (chosenNumber/2));
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
	}
	
}
