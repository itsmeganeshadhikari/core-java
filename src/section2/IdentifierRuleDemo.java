package section2;

public class IdentifierRuleDemo {

	// 1.a. we can not use digit(0-9) at first places of an identifiers
	// int 1anyVarDemo;
	// 1.b. but we can use digit at other places.
	int any1Var2Demo32321;
	// 2.we can not use whitespace
	// int any Var
	// Demo;
	// 3.we can not use any keywords as an identifiers
	// int package;
	// 4.we can not use any special symbols at any places
	// of an identifiers

	// int any&VarDemo#;
	
	//5.we can use underscore(_) at any places of an identifiers
	int _any_Var_Demo_;
	//6.we can use dollar($) sign at any places of an identifiers
	int $any$Var$Demo;
	//but use of dollar sign is discouraged

}
