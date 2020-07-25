package section7.polymorphismdemo;

public class BankAccount {

	double balance = 500;

	public void withdraw(double amount) {
		System.out.println("money is withdrawn without any charges");
	}

	public double withdraw(double amount, double fee) {
		System.out.println("money is withdrawn without any charges");
		balance = balance - amount - fee;
		return balance;
	}

	public static void main(String[] args) {
		// An example of compile time polymorphism(static binding)
		// which is achieved bu overloading of methods
		BankAccount ganeshAccount = new BankAccount();
		ganeshAccount.withdraw(200);

		BankAccount prithuAccount = new BankAccount();
		prithuAccount.withdraw(300, 20);
	}
}
