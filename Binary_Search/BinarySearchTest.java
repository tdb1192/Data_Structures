public class BinarySearchTest {

	public static void main(String[] args) {
		
		//Make test arrray of odd numbers from 1 to 19
		int[] numbers = new int[10];
		int counter = 0;
		
		for(int i = 1; i < 20; i++) {
			if( i % 2 > 0 ) {
				numbers[counter] = i;
				counter++;
			}
		}
		
		//Display test array
		System.out.println("\nTest Array: ");
		for(int i = 0; i < numbers.length - 1; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println(numbers[numbers.length - 1]);
		System.out.println();
		
		//Test BinarySearchOne positive cases
		System.out.println("Testing binarySearchOne positive cases: ");
		System.out.print("1:" + BinarySearch.binarySearchOne(numbers, 1) + ", ");
		System.out.print("5:" + BinarySearch.binarySearchOne(numbers, 5) + ", ");
		System.out.print("9:" + BinarySearch.binarySearchOne(numbers, 9) + ", ");
		System.out.print("13:" + BinarySearch.binarySearchOne(numbers, 13) + ", ");
		System.out.println("17:" + BinarySearch.binarySearchOne(numbers, 17) + "\n");
		//	Test negative cases
		System.out.println("Testing binarySearchOne negative cases: ");
		System.out.print("2:" + BinarySearch.binarySearchOne(numbers, 2) + ", ");
		System.out.print("10:" + BinarySearch.binarySearchOne(numbers, 10) + ", ");
		System.out.println("20:" + BinarySearch.binarySearchOne(numbers, 20) + "\n");
	
		//Test BinarySearchTwo positive cases
		System.out.println("Testing binarySearchTwo positive cases: ");
		System.out.print("1:" + BinarySearch.binarySearchTwo(numbers, 1) + ", ");
		System.out.print("5:" + BinarySearch.binarySearchTwo(numbers, 5) + ", ");
		System.out.print("9:" + BinarySearch.binarySearchTwo(numbers, 9) + ", ");
		System.out.print("13:" + BinarySearch.binarySearchTwo(numbers, 13) + ", ");
		System.out.println("17:" + BinarySearch.binarySearchTwo(numbers, 17) + "\n");
		//	Test negative cases
		System.out.println("Testing binarySearchTwo negative cases: ");
		System.out.print("2:" + BinarySearch.binarySearchTwo(numbers, 2) + ", ");
		System.out.print("10:" + BinarySearch.binarySearchTwo(numbers, 10) + ", ");
		System.out.println("20:" + BinarySearch.binarySearchTwo(numbers, 20));
	}
}