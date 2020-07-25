package section4.accessmodifierdeo;

public class AccesModifier {

	int defaultVar;
	public int publicVar;
	private int privateVar;
	protected int protectedVar;

	void defaultMethod() {

	}

	public void publicMethod() {

	}

	private void privateMethod() {

	}

	protected void prtoctedMethod() {

	}

	public AccesModifier() {

	}

	 AccesModifier(int a) {

	}

	private AccesModifier(int a, int b) {

	}

	protected AccesModifier(String s) {

	}
	
	
	public static void main(String[] args) {
		AccesModifier obj= new AccesModifier();
		obj.defaultMethod();
		obj.publicMethod();
		obj.prtoctedMethod();
		obj.privateMethod();
	}

}
