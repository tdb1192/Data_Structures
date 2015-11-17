class Employee extends Person {
	
	private double salary;
	
	public Employee(String n, int ag, String ad, String p, double s) {
		super(n, ag, ad, p); salary = s;
	}
	
	public String toString() {
		return super.toString() + " $" + getSalary();
	}
	
	public double getSalary() { return salary; }
	
	public void raise(double percentRaise) {
		salary *= (1 + percentRaise);
	}
}