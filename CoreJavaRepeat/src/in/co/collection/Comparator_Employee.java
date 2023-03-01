package in.co.collection;

import java.util.Comparator;

public class Comparator_Employee implements Comparable<Comparator_Employee> {
	
	public String name = null;
	public String address = null;
	public String dob = null;
	
	public Comparator_Employee (String name, String address,String dob) {
		this.name = name;
		this.address = address;
		this.dob= dob;
		
	}

	@Override
	public String toString() {
		
		return name + " "+ address + " "+ dob;
	}

	public int compareTo(Comparator_Employee o1) {
		
		if(this.name==o1.name) {return this.name.compareTo(o1.name);}
		else if  (this.address == o1.address) {
		return this.address.compareTo(o1.address);}
		else {return this.dob.compareTo(o1.dob);}
	
	}

	
	public boolean equals(Comparator_Employee obj) {
	
		return super.equals(obj);
	}
}
