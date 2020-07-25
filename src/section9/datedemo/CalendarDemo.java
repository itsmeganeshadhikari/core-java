package section9.datedemo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MINUTE));

		System.out.println("===========");
		calendar = new GregorianCalendar(2011, 01, 11);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MINUTE));
		
		System.out.println("===========");
		calendar= Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MINUTE));
		
		System.out.println("===========");
		calendar= Calendar.getInstance(Locale.JAPAN);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MINUTE));

		
		System.out.println("===========");
		
		DateFormat d= DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		System.out.println(d.format(new Date()));
	}

}
