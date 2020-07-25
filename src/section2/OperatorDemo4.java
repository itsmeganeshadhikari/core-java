package section2;

public class OperatorDemo4 {

	public static void main(String[] args) {

		//Ternary operator: ?:
		
		int a = 4;
		int b = 12;
		
//		if(a>b) {
//			System.out.println("a is greater than b");
//		}else {
//			System.out.println("b is greater than a");
//			}
//		
		String r = (a>b)?"a is greater than b":"b is greater than a";
		System.out.println(r);
		
		boolean rr = (a > b) ? true : false;
		System.out.println(rr);
		
	}

}
