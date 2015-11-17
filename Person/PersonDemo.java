public class PersonDemo {

	public static void main(String[] args) {
		Person[] p = new Person[4];
		p[0] = new Person("joe", 25, "New York", "215-555-1212");
		p[1] = new Student("jill", 27, "Chicago", "312-555-1212", 4.0);
		p[3] = new Employee("bob", 29, "Boston", "617-555-1212", 1000000.0);
		printAll(p);
	}
	
	public static void printAll(Person[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
			System.out.print("[" + i + "]");
			System.out.println(arr[i].toString());
			}
		}
	}
}