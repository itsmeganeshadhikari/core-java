package section4.librarydemo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double number = 325325.3453;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf.format(number));
		
		nf = new DecimalFormat("###");
		System.out.println(nf.format(number));
		nf = new DecimalFormat("0000000");
		System.out.println(nf.format(number));
		
		nf = new DecimalFormat("#######.###");
		System.out.println(nf.format(number));
		nf = new DecimalFormat("0000000.000");
		System.out.println(nf.format(number));
		
		

	}

}
