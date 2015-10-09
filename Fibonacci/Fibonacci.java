public class Fibonacci {

	public static int fibLoop(int n) {
		
		int result;
		
		if(n == 1) {
			result = n;
		}
		else {
			int prev = 0;
			int temp = 1;
			result = 1;
			for(int i = 2; i <= n; i++) {
				temp = result + prev;
				prev = result;
				result = temp;
			}
		}
		
		return result;
	}
	
	public static int fibRec(int position) {
		
		if(position == 1) {
			return 1;
		}
		else if(position == 0) {
			return 0;
		}
		else {
			return fibRec(position-1) + fibRec(position-2);
		}
		
	}	
	
}