package in.co.DateandCalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println("Date : " +d);
	
	// here for Simple Date Format
	Date d1 = new Date ();
	SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
	String str = SDF.format(d1);
	System.out.println("date: " + str);
	
	// here for again convert Sdf format into java format
	
	String str1 = "11/12/2023";
	Date d2= SDF.parse(str1);
	System.out.println(d2);
	
	
	

}

}