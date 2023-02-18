package in.co.DateandCalender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class Date_ {
	public static void main(String[] args) throws ParseException {

		Date d = new Date ();
		System.out.println("JavaDAte: " + d);
		System.out.println();
		
		// date format change here,
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String Str = sdf.format(d);
		System.out.println("Todays Date in SDF format: " + Str);
		
		System.out.println();
		// again the format is change with .parse
		
		String todayDate = "11/02/2023";
		Date d1 = sdf.parse(todayDate);
		System.out.println("Parse: " + d1);
		
	
	}

}
