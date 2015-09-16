public class MinTest {
	
	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("The min is " + Integer.toString(min(a,b)) + ".");	
		}
		catch(Exception e) {
			System.out.println("Please select two numbers to be compared.");
		}
		
	}
	
	public static int min(int x, int y) {
	
		return x<y ? x : y;
	
	}
	
}
