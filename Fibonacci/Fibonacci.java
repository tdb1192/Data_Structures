public class Fibonacci {

	//Generates the n'th Fibonacci number using a loop
	public static int fibLoop(int n) {
		
		int result;
		
		//	This addresses the fact that the first two Fibonacci
		//	Fibonacci numbers are 1.
		if(n == 1 || n == 2) { result = 1; }
		else {
			
			/*	Since the first two Fibonacci numbers are covered
				by the previous if statement, this for loop starts
				at 2 and then progresses until it reaches the n'th
				Fibonacci number. It the current Fibonacci number and
				the previous one in order to calculate the n'th one.
			*/
			
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
	
	//Generates the n'th Fibonacci number using recursion
	public static int fibRec(int position) {
		
		// 	This acts as the "base case" for the recursive method.
		if(position == 1 || position == 2) { return 1; }

		/*  Since a Fibonacci number is the sum of the two Fibonacci
			numbers before it, this recursive function returns the
			sum of two Fibonacci numbers before it.  Since it doesn't
			know the actual numbers, it will recursively call itself
			until it reaches the base case, and then it will start adding
			the numbers together until it reaches the n'th number.  Note
			that for every call of the function generates parallel trees
			of recursive calls.
		*/
		else {
			return fibRec(position-1) + fibRec(position-2);
		}
	}	
}