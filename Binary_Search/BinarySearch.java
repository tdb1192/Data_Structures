public class BinarySearch {
	
	public static <AnyType extends Comparable<? super AnyType>> int binarySearch( AnyType[] a, AnyType x) {
		
		final int NOT_FOUND = -1;
		int low = 0;
		int high = a.length - 1;
		int mid;

		while (low <= high) {
			
			mid = (low + high) / 2;
			
			if (a[mid].compareTo(x) < 0) {
				low = mid + 1;
			}
			else if(a[mid].compareTo(x) > 0) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		
		return NOT_FOUND;
	}
}
