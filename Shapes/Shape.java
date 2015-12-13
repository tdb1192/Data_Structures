public abstract class Shape implements Comparable {

	public abstract double area();
	public abstract double perimeter();
	
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