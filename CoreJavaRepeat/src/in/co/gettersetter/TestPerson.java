package in.co.gettersetter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
public static void main(String[] args) {
	
	Person P = new Person();
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM/yyyy");
	String str = sdf.format(d);
	
	P.setName("rays");
	P.setAddress("Madhumilan Square");
	
	String name = P.getName();
	String address = P.getAddress();
	Date str1 = P.getDOB();
	
	System.out.println(name);
	System.out.println(address);
	System.out.println(str);
	System.out.println(P.AVG_AGE());
	
	
}
}
