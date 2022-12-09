package in.co.Constructor;

public class StudentData {
	
	private String stdname;
	private int rollnumber;
	private int idnumber;
	private String sclname;
	
	// parameterized Constructor
	
	public StudentData (String stdname,int rollnumber, int idnumber, String sclname) {
		
		this.stdname = stdname;
		this.rollnumber = rollnumber;
		this.idnumber = idnumber;
		this.sclname = sclname;
	}
	
	// default constructor
	
	public StudentData () {
		super ();
	}
	
	//getter method
	
	public String getstdname () {
		return stdname;
	}
	public int getrollnumber() {
		return rollnumber;
	}
	public int getidnumber() {
		return idnumber;
	}
	public String getsclname() {
		return sclname;
	}
	
	
	}