package in.co.rays;
import java.util.Date;
import java.util.Calendar;


public class Calender {
	public static void main(String[] args) {
		
		Date d = new Date ();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// for the current time to set
		
		cal.setTime(d);
		System.out.println(cal.getTime());
		
		// for current day in calendar
		
		int year = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(year);
		
		// for yesterdays date
		
		cal.add(Calendar.DATE,-1);
		Date yesterday = cal.getTime();
		System.out.println(yesterday);
		
		//for after one month date
		
		cal.add(Calendar.DATE,30);
		Date month = cal.getTime();
		System.out.println(month);
		
		}
		}
