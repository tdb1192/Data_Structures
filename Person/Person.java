public class Person {
	
	private String name;
	private int age;
	private String address;
	private String phone;
	
	public Person(String n, int ag, String ad, String p) {
		name = n; age = ag; address = ad; phone = p;
	}
	
	public String toString() {
		return getName() + " " + getAge() + " " + getPhoneNumber();
	}
	
	public String getName() { return name; }
	
	public int getAge() { return age;}
	
	public String getPhoneNumber() { return phone; }
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public void setPhoneNumber(String newPhone) {
		phone = newPhone;
	}
}