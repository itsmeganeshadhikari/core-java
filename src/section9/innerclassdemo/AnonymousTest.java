package section9.innerclassdemo;

public class AnonymousTest {

	public static void main(String[] args) {
		Anonymous obj1=new Anonymous();
		obj1.greet();
		Anonymous obj2=new Anonymous() {
			
			public void greet() {
				System.out.println("helloooooooo, gooooood morning");
			}
		};
		obj2.greet();

		Account savingAccount= new Account() {
			
			@Override
			public void withdraw() {
				System.out.println("money is withdrawn");
				
			}
		};
		
		savingAccount.withdraw();
	}

}
