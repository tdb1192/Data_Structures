class ShapeDemo {
	
	public static double totalArea(Shape[] arr) {
		
		double total = 0;
		
		for (Shape s : arr ) {
			if(s != null) {
				total += s.area();
			}
		}
		
		return total;
	}
	
	public static void printAll(Shape[] arr) {
		for (Shape s : arr ) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Shape[] a = { new Circle(2.0), new Rectangle(1.0, 3.0), null};
		
		System.out.println("Total area = " + totalArea(a));
		printAll(a);
	}
}