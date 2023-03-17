package in.co.collection;

import java.util.Comparator;

public class Comparable_Employee implements Comparable<Comparable_Employee> {
	
	public String name = null;
	public String address = null;
	public String dob = null;
	
	public Comparable_Employee (String name, String address,String dob) {
		this.name = name;
		this.address = address;
		this.dob= dob;
		
	}

	@Override
	public String toString() {
		
		return name + " "+ address + " "+ dob;
	}

	public int compareTo(Comparable_Employee o1) {
		
		if(this.name==o1.name) {return this.name.compareTo(o1.name);}
		else if  (this.address == o1.address) {
		return this.address.compareTo(o1.address);}
		else {return this.dob.compareTo(o1.dob);}
	
	}

	
	public boolean equals(Comparable_Employee obj) {
	
		if (this.name==obj.name && this.address==obj.address && this.dob==obj.dob) {
			return true;
	}else {
		return false;
	}
	}
}
