package in.co.InterfaceOOP;

public class Person1 {
	
	protected String firstname =  null;
	protected String lastname =  null;
	protected String address =null;
	
	public Person1 () {
		System.out.println("this is default of person1 class");
	}
	
	public Person1(String fn, String ln) {
		firstname = fn;
		lastname = ln;
		
		System.out.println("2 parameterized constructor");
	}
	
	public Person1 (String fn, String ln, String address) {
		this(fn,ln);
		this.address = address;
		System.out.println("3 para constructor");
	}

}
