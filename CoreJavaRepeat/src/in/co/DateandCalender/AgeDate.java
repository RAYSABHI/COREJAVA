package in.co.DateandCalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeDate {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		String str = s1.format(d);
		
		String DOB = "24/03/2000";
		Date d1 = s1.parse(DOB);
	//	s1.format(DOB);
		
		System.out.println(str);
		//System.out.println(str.getDate()-DOB.getDate());
		
		System.out.println(d.getDay()-d1.getDay());
		System.out.println(d.getMonth()-d1.getMonth());
		System.out.println(d.getYear()-d1.getYear());
		
		
		
	}

}
