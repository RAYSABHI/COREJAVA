package in.co.gettersetter;

import java.util.Date;

public class Person {

	private String name;
	private String address;
	private Date dob;
	public static final int AVG_AGE =18;
	
	
	//GETTER SETTER
	
	public void setName(String name) {
		this.name = name;
		
		}
		public String getName() {
			return name;
		}
		
	public void setAddress(String address) {
		this.address = address;
			
		}
		public String getAddress() {
			return address;
				
		}
		
	public void setDOB(Date dob) {
		this.dob = dob;
		}
		public Date getDOB() {
			return dob;
			
		}
		
	public int AVG_AGE() {
		return AVG_AGE;
	}
}
