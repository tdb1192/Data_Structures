public abstract class Shape implements Comparable {

	//	Two methods that the Circle and Rectangle will need to define
	public abstract double area();
	public abstract double perimeter();
	
	//	Returns 1 if the first object's area is larger than the second's
	//	Returns 0 if they areas are the same
	//	Returns -1 if the first object's area is smaller than the second's
	public int compareTo( Object s ) {
		Shape second = (Shape) s;
		double diff = area() - second.area();
		
		if( diff==0 ){ return 0; }
		else if( diff < 0 ) { return -1; }
		else { return 1; }

	}
	
	public double semiperimeter() {
		return perimeter()/2;
	}
}