/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

public class TestAccount 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//create objects
		Account account = new Account(115, 5000);
		CheckingAccount checking = new CheckingAccount(511, 2000, -10);
		SavingsAccount savings = new SavingsAccount(151, 10000);
		
		
		//set the annualInterestRate (4.5% from hw1)
		account.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		
		//withdraw amount = 3000
		account.withdraw(3000);
		checking.withdraw(3000);
		savings.withdraw(3000);
		
		//deposit amount = 1000
		account.deposit(1000);
		checking.deposit(1000);
		savings.deposit(1000);
		
		//print out toString methods
		System.out.println("\n" + account.toString());
		System.out.println("\n" + checking.toString());
		System.out.println("\n" + savings.toString());
	}
	

}
