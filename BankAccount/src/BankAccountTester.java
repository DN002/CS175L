import java.util.Scanner;

public class BankAccountTester {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount to start your account: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter interest percent: ");
		double pct = input.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(amount, pct);
		System.out.print("Created new account with "+amount +" ");
		
		System.out.print("Enter amount to deposit: ");
		double deposit = input.nextDouble();
		myBankAccount.deposit(deposit);	
		System.out.print("Successfully deposited: "+deposit +" ");
		System.out.println("Balance after deposit attempt: "+myBankAccount.getBalance());
		
		
		System.out.print("Enter amount to withdraw: ");
		double withdraw = input.nextDouble();
		myBankAccount.withdraw(withdraw);
		System.out.println("Balance after withdrawl attempt: "+myBankAccount.getBalance());
		
		myBankAccount.calcInterest();
		
		System.out.println("Balance + Calculated Interest: "+myBankAccount.getBalance());
		
		input.close();
	}
	
}
