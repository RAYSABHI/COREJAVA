package in.co.DateandCalender;

import java.util.Calendar;
import java.util.Date;

public class Calender1 {
	public static void main(String[] args) {
		
		Date today = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(today);
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		
	}

}
