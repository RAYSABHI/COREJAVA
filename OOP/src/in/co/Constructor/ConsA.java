package in.co.Constructor;

public class ConsA {
	
	private String Fname;
	private String Lname;
	private int Id;
	
	// getter method
	
		public String getFname() {
			return Fname;
		}
		
		public String getLname() {
			return Lname;
		}
		
		public int getId() {
			return Id;
		}
		
		
	// parameterized Constructor
	
	public ConsA(String fname, String lname, int id) {
		
		this.Fname = fname;
		this.Lname= lname;
		this.Id = id;
	}
	
	// default constructor
	
	public ConsA() {
		super ();
	}

	}
	
	
	
		
		
	
