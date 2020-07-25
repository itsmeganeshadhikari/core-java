package section4.accessmodifierdeo;

public class AccesModifierChild extends AccesModifier {

	public static void main(String[] args) {
		AccesModifier obj = new AccesModifier();
		obj.defaultMethod();
		obj.publicMethod();
		obj.prtoctedMethod();
		// obj.privateMethod();
	}
}
