package in.co.Exercise9_7;

public class Q3_Person {
	
	protected String firstName;
	protected String lastName;
	
	@Override
	public String toString() {
		String fullName = firstName + lastName;
		return fullName;
	}
	public Q3_Person (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
