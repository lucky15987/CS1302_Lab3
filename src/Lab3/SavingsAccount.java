/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

public class SavingsAccount extends Account
{
	//no-arg constructor
	public SavingsAccount()
	{
		super();
	}
	
	//Savings account constructor with attributes (id and balance)
	public SavingsAccount(int id, double balance)
	{
		super(id, balance);
	}
	
	//withdraw amount from balance, includes error statement if amount > balance
	public void withdraw(double amount)
	{
		if (amount < getBalance())
		{
			setBalance(getBalance() - amount);
		}
		else
			{
				System.out.println("Error: Amount is more than the current balance");
			}
	}
	
	
}
