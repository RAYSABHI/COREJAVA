package in.co.collection;

public class Employee_toString {
	
	public String name = null;
	public String address = null;
	/*
	 * public Employee_toString () {
	 * 
	 * }
	 */

		public Employee_toString (String name , String address) {
			this.name = name;
			this.address = address;
		}

		@Override
		public String toString() {
			
			return name + " "+ address;
			
		}

		
		public boolean equals(Employee_toString obj) {
			
			if (this.name ==obj.name && this.address==obj.address) {
				return true;
		}else {
			return false;
		}
		
		
				
}
}
