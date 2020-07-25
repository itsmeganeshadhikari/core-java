package section9.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// from Date to String
		Date currentDate = new Date();
		System.out.println(currentDate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm a MM/dd/yyyy");
		String d = dateFormat.format(currentDate);
		System.out.println(d);

		// from String to Date
		String date = "2011-01-11";
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = dateFormat.parse(date);
		System.out.println(dd);
	}
}
