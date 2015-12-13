class ShapeDemo {
	
	// Adds up the total area of all shapes in the array, ignoring nulls
	public static double totalArea(Shape[] arr) {
		
		double total = 0;
		
		for (Shape s : arr ) {
			if(s != null) {
				total += s.area();
			}
		}
		
		return total;
	}
	
	//	Prints shapes in the array, utilizing their toString() methods
	public static void printAll(Shape[] arr) {
		for (Shape s : arr ) {
			System.out.println(s);
		}
	}
	
	//	Makes an array containing a circle and rectangle, calculates their total area
	//	And compares the areas of the circle and rectangle
	public static void main(String[] args) {
		
		Shape[] a = { new Circle(2.0), new Rectangle(1.0, 3.0), null};
		
		System.out.println("Total area = " + totalArea(a));
		printAll(a);
		
		int result = a[0].compareTo(a[1]);
		
		if(result == 0) {
			System.out.println("The areas of the two objects are the same");
		}
		else if(result == 1) {
			System.out.println("The area of the circle is greater than the area of the rectangle.");
		}
		else {
			System.out.println("The area of the circle is less than the area of the rectangle.");
		}
	}

}