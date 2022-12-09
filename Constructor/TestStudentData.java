package in.co.Constructor;

public class TestStudentData {
public static void main(String[] args) {
	
	StudentData sd = new StudentData ("ram",123,04,"DelhiPublicSchool");
	
	String name = sd.getstdname();
	System.out.println(name);
	
	int id = sd.getidnumber();
	System.out.println(id);
	
	int roll = sd.getrollnumber();
	System.out.println(roll);
	
	String scname = sd.getsclname();
	System.out.println(scname);
}
}
