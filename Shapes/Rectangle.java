public class Rectangle extends Shape {
	
	//	This method overrides the original area method in shape
	//	It is defined specifically for rectangles
	public double area() {
		return length * width;
	}
		
	//	These methods and variables are methods only for rectangles	
	private double length;
	private double width;
	
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}
	
	public String toString() {
		return "Rectangle: " + length + ", " + width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth() {
		return width;
	}
}