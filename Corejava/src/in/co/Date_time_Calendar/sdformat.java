package in.co.Date_time_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sdformat {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat abhi = new SimpleDateFormat("dd/MM/yyyy");
		
		String str = abhi.format(d);
		
		System.out.println(str);
		
		String str1 = "03/06/1996";
		
		Date d1 = abhi.parse(str1);
		
		System.out.println(d1);
		
	}

}
