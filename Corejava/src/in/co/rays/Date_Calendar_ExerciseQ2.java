package in.co.rays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date_Calendar_ExerciseQ2 {
public static void main(String[] args) {
	
	// Q.2
	Date d =new Date ();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar today =Calendar.getInstance();
	today.setTime(d);
	
	for (int i=1; i<=12;i++){
		today.add(Calendar.DATE,30);
		Date month = today.getTime();
		System.out.println(month);
		
	}
	

	}
	}
