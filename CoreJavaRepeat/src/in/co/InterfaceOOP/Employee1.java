package in.co.InterfaceOOP;

public class Employee1 extends Person1 {

	private String designation =null;
	
	// default constructor
	
	public Employee1() {
		System.out.println("this is default of employee1");
	}
	
	public Employee1 (String fn , String ln, String des) {
		super (fn,ln);
		designation = des;
		System.out.println("3 para constructor of employee1");
	}
}
