package section8.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo6 {

	public static void main(String[] args) {

		parseDate();
		System.out.println("end");
	}

	public static void parseDate() {
		String date = "2011-01-11";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dd;
		try {
			dd = dateFormat.parse(date);
			System.out.println(dd);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
