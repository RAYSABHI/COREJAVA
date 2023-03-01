package in.co.SuperCallConstructor;

public class Person {
	
	protected String firstName;
	protected String lastName;
	protected String address;
	
	public Person() {
		System.out.println("default constructor of Person class");
	}
	
	public Person(String fn , String ln) {
		firstName = fn;
		lastName = ln;
		System.out.println("2 para constructor of Person class");
	}
	
	public Person (String fn , String ln ,String address) {
		this(fn,ln);
		this.address = address;
	}

}
