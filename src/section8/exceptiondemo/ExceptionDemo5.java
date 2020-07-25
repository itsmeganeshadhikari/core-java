package section8.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {

	public static void main(String[] args) throws ParseException {

		parseDate();
		System.out.println("end");
	}

	public static void parseDate() throws ParseException {
		String date = "2011-01-11";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = dateFormat.parse(date);
		System.out.println(dd);
	}
}
