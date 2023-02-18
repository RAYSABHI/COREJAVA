package in.co.rays;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_Time {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date ();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String date =sdf.format(d);
		System.out.println(date);
	
		Date d1 = sdf.parse(date);
		System.out.println(d1);
		
	
	}

}
