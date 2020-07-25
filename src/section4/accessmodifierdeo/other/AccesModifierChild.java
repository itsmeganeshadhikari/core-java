package section4.accessmodifierdeo.other;

import section4.accessmodifierdeo.AccesModifier;

public class AccesModifierChild extends AccesModifier {

	public static void main(String[] args) {
		AccesModifier obj = new AccesModifier();
		// obj.defaultMethod();
		obj.publicMethod();
		// obj.prtoctedMethod();
		// obj.privateMethod();
		
		AccesModifierChild o= new AccesModifierChild();
		o.prtoctedMethod();
	}
}
