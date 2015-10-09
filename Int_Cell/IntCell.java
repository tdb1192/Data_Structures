public class IntCell {
	
	public int read(){
		return storedValue; 
	}
	
	public void write(int x) {
		storedValue = x;
	}
	
	private int storedValue;
	
}