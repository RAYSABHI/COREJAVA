package in.co.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date_Calendar_ExerciseQ1 {
	public static void main(String[] args) throws ParseException {
		
		// Q.1 age of employee
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse("24/03/1995"));
		
		Calendar currenttime = Calendar.getInstance();
		int dob =cal.get(Calendar.YEAR);
		int today = currenttime.get(Calendar.YEAR);
		
		int age = today - dob;
		System.out.println("your age is : "+age);
		
		
		}

}
