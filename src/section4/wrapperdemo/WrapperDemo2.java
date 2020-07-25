package section4.wrapperdemo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// 2. Converting a numeric string into its number type.
		String s1="100";
		int n1=Integer.parseInt(s1);
		String s2="10.3";
		double n2=Double.parseDouble(s2);
		double sum=n1+n2;
		System.out.println(sum);
	}
}
