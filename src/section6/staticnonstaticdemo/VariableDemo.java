package section6.staticnonstaticdemo;

public class VariableDemo {

	// non-static variable(instance variable, properties
	//member data, data, attributes)
	int a;
	// static variable
	static int b;

	// This is non-static reference variable
	VariableDemo referenceVar;

	// This is static reference variable
	static VariableDemo referenceVars;

	public static void main(String[] args) {

		// local variable
		int x;

		// This is local reference variable
		VariableDemo referenceVar;
	}

	// a and s are known as parameters(arguments)
	// acts as a local variable
	public void m1(int a, String s) {
		// local variable
		int y;
	}

}
