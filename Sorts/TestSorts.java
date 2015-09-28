import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestSorts {
	
	public static void main( String[] args ) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String response;

		try {
			do {
				/*	This loop establishes an "unsorted array", and then asks for
					user input as to which sorting method should be used to sort it.
				*/
				int[] a  = {5,4,3,8,1};
			
				System.out.print("Unsorted array: ");
				System.out.println(Arrays.toString(a));
				System.out.print("Please select a sorting option (i/i2/b/q): ");
				response = reader.readLine();
				
				switch(response) {
					// Each option prints which selection was made and then prints the sorted array

					case "i": 	Sorts.insertionSort(a,a.length);
								System.out.println("Insertion Sort 1 selected.");
								System.out.print("Resulting array: ");
								System.out.println(Arrays.toString(a));
							break;
					case "i2":	Sorts.insertionSort2(a,a.length);
								System.out.println("Insertion Sort 2 selected.");
								System.out.print("Resulting array: ");
								System.out.println(Arrays.toString(a));
							break;
					case "b":	Sorts.bubbleSort(a,a.length);
								System.out.println("Bubble Sort selected.");
								System.out.print("Resulting array: ");
								System.out.println(Arrays.toString(a));
							break;
					case "q":	break;
					default:	System.out.println("Incorrect option selected.");
								System.out.println();
							break;	
				}
				System.out.println();
				
			// The loop will continue unil the user selects "(q)uit"
			}
			while(!response.equals("q"));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
