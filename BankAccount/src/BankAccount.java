
/**
A bank account has a balance and a mechanism for
applying interest or fees at the end of the month.
*/
public class BankAccount
{
	private double balance;
	private double interestPct;
	/**
   	Constructs a bank account with zero balance.
	* @param amount 
	*/
	public BankAccount(double amount, double pct)
	{
		balance = amount;
		interestPct = pct;
	}

/**
   Makes a deposit into this account.
   @param amount the amount of the deposit
*/
	public void deposit(double amount)
	{
		balance = balance + amount;
	}

/**
   Makes a withdrawal from this account, or charges a penalty if
   sufficient funds are not available.
   @param amount the amount of the withdrawal
*/
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount <= balance) 
		{	balance = balance - withdrawAmount;
			System.out.print("Successfully withdrawn: "+withdrawAmount +" ");
		}
		else {System.out.println("Insufficient Funds to support withdrawal.");}
	}
/**
   Gets the current balance of this bank account.
 * @param newAmt, double interestPct 
*/
	
	public void calcInterest()
	{
		balance = balance + (balance * interestPct);
	}
	
	public double getBalance()
	{
		return balance;
	}
}
