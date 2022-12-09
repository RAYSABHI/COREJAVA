package in.co.Encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.setName2("shyam");
		std.setROLLNUMBER(123);
		std.setID(04);
		std.setSCLNAME("ips");
		
		
		String Name = std.getName2();
		System.out.println("student name is : "+ Name);
		
		int rollnumber = std.getROLLNUMB();
		System.out.println("roll number : "+ rollnumber);
		
		int id = std.getID();
		System.out.println("ID number :" +id);
		
		String sclname = std.getSCLNAME();
		System.out.println("school name : "+ sclname);
	

	}

}
