public class Sorts {
	
	public static void insertionSort(int[] a, int n) {
		
		for (int i=1; i<n; i++) {
			
			int curr = a[i];
			int j = i-1;
			
			while((j>=0) && (a[j] > curr)) {
				
				a[j+1] = a[j--];
			}
			
			a[j+1] = curr;
		}
	}
	
	public static void insertionSort2(int[] a, int n) {
		
		for(int i=1; i<n; i++) {
			
			int curr = a[i];
			int j = i;
			
			while((j>0) && (a[j-1] > curr)) {
				
				a[j] = a[j-- - 1];
			}
			
			a[j] = curr;
		}
	}
	
	public static void bubbleSort(int[] a, int n) {
	
		for(int j=0; j<n-1; j++) {
			
			for(int jj=0; jj<n-1; jj++) {
				
				if(a[jj] >= a[jj+1]) {
					
					int t = a[jj];
					a[jj] = a[jj+1];
					a[jj+1] = t;
				}
			}
		}
	}
}