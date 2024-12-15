package com.lab_banking_application;

public class BankAccount implements Bank {

	 @SuppressWarnings("unused")
	private long accountNumber;
	 private double balance;
	 
	 public BankAccount()
	 {
		 
	 }
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	@Override
	public void deposit(double amount)
	{
		if(amount<1000)
		{
			try {
				throw new InvalidAmountException("Minimum deposit 1000 Rupees");
			}
			catch(InvalidAmountException i)
			{
				System.err.println(i);

			}
		}
		
		else 
			{
			System.out.println("Amount Deposited Successfully");
			this.balance+=amount;
			}
		
	}
	
	@Override
	public void withDraw(double amount)
	{
		try {
			if(amount>this.balance) {
				throw new InsufficientFundsException("Withdrawl amount is grater than the balance");
			}
			else if(amount<=0)
			{
				throw new InvalidAmountException("Withdrawl amount cannot be negative or zero");
			}
			else {
				this.balance=this.balance-amount;
				System.out.println("Withdraw successful");
				
			}
		}
		catch(InsufficientFundsException|InvalidAmountException e)
		{
			if(e instanceof InsufficientFundsException)
			{
				System.err.println(e);
			}
			else {
				System.err.println(e);
			}
		}	
	}
	 
	@Override
	public void transfer(BankAccount bankAccount,double amount)
	{
		try {
			if(amount>this.balance)
			{
				throw new InsufficientFundsException("Insufficient Balance");
			}
			else if(bankAccount==null)
			{
				throw new AccountNotFoundException("Account is Not Found");
			}
			else if(amount<=0)
			{
				throw new InvalidAmountException("Amount is invalid");
			}
			else 
			{
				this.balance-=amount;
				System.out.println("Amount Transferred Successfully to : ");
			}
		 }
		 catch(InsufficientFundsException|AccountNotFoundException|InvalidAmountException e)
		 {
			 if(e instanceof InsufficientFundsException)
			 {
				 System.err.println(e);
			 }
			 else if(e instanceof AccountNotFoundException)
			 {
				 System.err.println(e);
			 }
			 else {
				 System.err.println(e);
			 }
		 }
	}
	
	@Override
	public void applyForLoan(double amount)
	{
		try {
			if(this.balance<50000)
			{
				throw new LoanNotAllowedException("Loan is not allowed limit is 50000");
			}
			else if(amount<0)
			{
		    throw new InvalidAmountException("Invalid Amount");
			}
			else {
				this.balance-=amount;
				System.out.println("Loan Approved");
			}
		}
		catch(LoanNotAllowedException|InvalidAmountException e)
		{
			if(e instanceof LoanNotAllowedException)
			{
				System.err.println(e);
			}
			else {
				System.err.println(e);
			}
		}
	}
	public double getBalance()
	{
		 return this.balance;
	}
}
