import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestSorts {
	
	public static void main( String[] args ) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String response;

		try {
			
			do {
			
				int[] a  = {5,4,3,8,1};
			
				System.out.print("Unsorted array: ");
				System.out.println(Arrays.toString(a));
				System.out.print("Please select a sorting option (i/i2/b/q): ");
				response = reader.readLine();
				
				switch(response) {
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
					default:	System.out.println("Incorrect option selected.");
								System.out.println();
							break;	
				}
				System.out.println();
				
			}
			while(!response.equals("q"));

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}