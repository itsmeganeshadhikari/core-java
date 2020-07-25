package section4.librarydemo;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger n1=new BigInteger("922337203685477580745664");
		BigInteger n2=new BigInteger("922337203685477580745664");
		BigInteger result=n1.add(n2);
		System.out.println(result);
		result=n1.subtract(n2);
		System.out.println(result);
		result=n1.multiply(n2);
		System.out.println(result);
		result=n1.divide(n2);
		System.out.println(result);
	}

}
