public class TestIntCell {
	
	public static void main(String[] args) {
		IntCell m = new IntCell();
		
		m.write(5);
		System.out.println("Cell contents: " + m.read());
	}

}