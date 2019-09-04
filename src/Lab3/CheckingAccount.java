/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

public class CheckingAccount extends Account
{
	//data fields
	private double overdraftLimit;
	
	//no-arg constructor
	public CheckingAccount()
	{
		super();
		overdraftLimit = 0;
	}
	
	//constructor for Checking
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	//setter for overdraft Limit
	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}
	
	//getter for overdraft Limit
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	
	// withdraws balance by a specified amount, returns error if pass limit
	public void withdraw(double amount)
	{
		if (getBalance() - amount > overdraftLimit)
		{
			setBalance(getBalance() - amount);
		}
		else 
		{
			System.out.println("Checking Account Error! Checking Amount exceeds Overdraft Limit");
		}
	}
	
	//Prints out Checking Account Info
	public String toString()
	{
		return super.toString() + "\nOverdraft Limit: " + overdraftLimit;
	}
	
}
