public class Fibonacci {

	public static int fibLoop(int n) {
		
		int result;
		
		if(n < 4) {
			result = n;
		}
		else {
			int prev = 2;
			int temp = 3;
			result = 3;
			for(int i = 4; i <= n; i++) {
				temp = result + prev;
				prev = result;
				result = temp;
			}
		}
		
		return result;
	}
	
}