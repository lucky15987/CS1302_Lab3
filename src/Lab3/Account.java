/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

import java.util.Date;

public class Account 
{
	//data fields
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		
		
		//no-arg constructor account
		public Account()
		{
			this(0,0);
		}
		
		//constructor for new accounts
		public Account(int id, double balance)
		{
			this.id = id;
			this.balance = balance;
			annualInterestRate = 0;
			dateCreated = new Date();
			
			
		}
		
		//setter for annualInterestRate
		public void setAnnualInterestRate(double annualInterestRate)
		{
			this.annualInterestRate = annualInterestRate;
		}
		
		//time stamp
		public String getDate()
		{		
			return dateCreated.toString();
		}
		
		//get monthly Interest Rate
		public double getMonthlyInterestRate()
		{
			double monthlyInterestRate = ((annualInterestRate / 100) / 12);
			return monthlyInterestRate;
		}
		
		//get monthly interest
		public double getMonthlyInterest()
		{
			double monthlyInterest = (balance * getMonthlyInterestRate());
			return monthlyInterest;
			
		}
		
		//set balance
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		
		
		//set deposit
		public void deposit(double amount)
		{		
			balance += amount;		
		}	
		
		//getter for balance
		public double getBalance()
		{
			return balance;
		}
		
		//withdraw method
		public void withdraw(double amount)
		{
			balance -= amount;
		}

		//toString method
		public String toString()
		{
			return ("Account ID: " + id + "\nNew Account Balance (After Deposits and Withdraws): " + 
					balance + "\nMonthly Interest Rate (adjusted to New Balance):    " 
					+ getMonthlyInterest() + "%\nDate Opened: " + getDate());
		}
}
		

