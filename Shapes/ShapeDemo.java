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