import java.util.Scanner;

public class BankThreshold {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an opening balance: "); 	// Enter 1000
		double openBal = in.nextDouble();

		System.out.println("Enter an interest percent: "); 	// Enter 0.05
		double interestPct = in.nextDouble();

		BankAccount acct = new BankAccount(openBal, interestPct);

		System.out.println("Enter a threshold: "); 			// Enter 1500

		while (in.hasNextDouble()) {
			double threshold = in.nextDouble();
			acct = new BankAccount(openBal, interestPct); 	// Resets the account
			int months = 0; 								// Resets the months
			
			if (openBal <= threshold) {
				while (acct.getBalance() < threshold) {
					acct.calcInterest();
					months++;
				}
				System.out.print("Number of Months to reach the threshold: " + months);
				System.out.println("\nBalance: " + acct.getBalance());
			} else {
				System.out.println("The balance is greater than this threshold. Balance: " + acct.getBalance());
			}
			System.out.println("\nEnter a threshold or type end: ");
		}
		in.close();
	}
}
