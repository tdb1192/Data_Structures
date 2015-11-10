public class BinarySearch {

	public static final int NOT_FOUND = -1;

	//Perform a binary search that makes two comparisons per level
	public static int binarySearchTwo(int[] a, int x) {
		
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			//If greater than mid, shrink search range to be mid + 1 to end
			if(a[mid] < x) { low = mid + 1; }
			//If less than mid, shrink search range to be beginning to mid - 1
			else if(a[mid] > x) { high = mid - 1; }
			else { return mid; }
			
		}
		
		return NOT_FOUND;
	}
		
	//Performs a binary serach that makes one comparison per level
	//Removes implicit test for succesful search in the inner loop
	public static int binarySearchOne(int[] a, int x) {
		
		if (a.length == 0) { return NOT_FOUND; }
		
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while (low < high) {
			mid = (low + high) / 2;
			
			//If greater than mid, shrink range to be mid + 1 to end
			if (a[mid] < x) { low = mid + 1; }
			//If less than mid, shrink range to be beginning to mid
			else { high = mid; }
		}
		
		if (a[low] == x) { return low; }
		
		return NOT_FOUND;
	}
}
