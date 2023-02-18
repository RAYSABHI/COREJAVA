package in.co.rays;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateCalendarExerciseQ3 {
public static void main(String[] args) throws ParseException {
	
	// Q.3 Date Comparison
	
	String start_date = "1/11/2022";
	String end_date = "10/11/2022";
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	Date start1 = sdf.parse(start_date);
	Date end1 = sdf.parse(end_date);
	
	if (start1.getTime()>end1.getTime()) {
		System.out.println("Correct");
	}
	else {
		System.out.println("Error!!");
	}
}
}
