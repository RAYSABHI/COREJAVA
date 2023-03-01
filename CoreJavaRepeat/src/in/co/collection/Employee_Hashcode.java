package in.co.collection;

public class Employee_Hashcode {
	
	public String name = null;
	public String address = null;
	
	public Employee_Hashcode (String name, String address) {
		this.name =  name;
		this.address = address;
		
	}

	
	public boolean equals(Employee_Hashcode obj) {

		if (this.name == obj.name && this.address == obj.address) {
		return true;
	} else {
		return false;
	}
	}  

	@Override
	public String toString() {
		
		return name + " "+ address;
	}

	@Override
	public int hashCode() {
		
		return name.hashCode();
	}
	
	
	
	
	

}
