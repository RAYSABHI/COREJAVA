package in.co.SuperCallConstructor;

public class Employee extends Person {
	
	 String designation = null;
	
	public Employee () {
		System.out.println("default of Employee class");
	}
	
	public Employee(String fn ,String ln, String des) {
		super (fn,ln);
		designation = des;
		System.out.println("3 para cons of Employee class");
	}

}
