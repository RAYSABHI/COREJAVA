package in.co.DateandCalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFformat {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String todays_date = sdf.format(d);
		System.out.println(todays_date);

		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM-dd/yyyy");
		String today = sdf2.format(d);
		System.out.println(today);

		String Todaydate = "07/02/2023";

		Date d1 = sdf.parse(Todaydate);
		System.out.println(d1);
		System.out.println(sdf.format(d1)); // this is for manual date print


	}
}
