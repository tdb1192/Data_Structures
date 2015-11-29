public class Circle extends Shape {
	
	//	This method overrides the origina area method in shape
	//	It is defined specifically for circles
	public double area() {
		return Math.PI * radius * radius;
	}

	//	These methods and variables are methods only for circles
	private double radius;

	public Circle(double rad) {
		radius = rad;
	}
	
	//	This method could also be defined in the Shape class
	//	and overridden, since all shapes have a perimeter
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "Circle: " + radius;
	}

}