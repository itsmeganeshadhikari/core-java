package section4.librarydemo;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal n1=new BigDecimal("9223372036854.77580745664");
		BigDecimal n2=new BigDecimal("92233720368547.7580745664");
		BigDecimal result=n1.add(n2);
		System.out.println(result);
		result=n1.subtract(n2);
		System.out.println(result);
		result=n1.multiply(n2);
		System.out.println(result);
//		result=n1.divide(n2);
//		System.out.println(result);

	}

}
