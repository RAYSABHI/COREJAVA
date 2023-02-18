package in.co.constructor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name = null;
	private String address = null;
	private Date dateOfBirth = null;
	
	SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
	String str = sdf.format(dateOfBirth);
	
	//default constructor
	public Person () {
		
	}
	
	// parametrized constructor
	public Person (String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// overloading with multiple constructor
	public Person(String n, String a, String d) {
		name =n;
		address =a;
		str = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Date getD() {
		return dateOfBirth;
	}
	
}
