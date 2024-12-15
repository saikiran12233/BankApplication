package com.lab_banking_application;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
	    BankAccount account1=new BankAccount(223344,1000);
	    BankAccount account2=new BankAccount(223355,1000);
	    
	    Customer c1=new Customer("sai",account1);
	    
	    while(true) {
	    	
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Welcome ====");
		System.out.println("Select an Option : ");
		System.out.println("               1.Deposit");
		System.out.println("               2.Withdraw");
		System.out.println("               3.Transfer");
		System.out.println("               4.LoanApplication");
		System.out.println("               5.CheckBalance");
		System.out.println("               6.Exit");
		
		System.out.print("Enter Your Option : ");
		int num=sc.nextInt();
		try
		{
		switch(num)
		{
		case 1:
		{
			System.out.print("Enter the amount to deposit : ");
			int amount=sc.nextInt();
			c1.getAccount().deposit(amount);
			break;
		}
		case 2:
		{
			System.out.print("Enter the amount to Withdraw : ");
			int amount=sc.nextInt();
			c1.getAccount().withDraw(amount);
			break;
		}
		case 3:
		{
			System.out.print("Enter transfer Amount:");
			int amount=sc.nextInt();
			c1.getAccount().transfer(account2,amount);
			break;
		}
		case 4:
		{
			System.out.print("Enter loan Amount:");
			int amount=sc.nextInt();
			c1.getAccount().applyForLoan(amount);
			break;
		}
		case 5:
		{
			System.out.println("Balance : "+c1.getAccount().getBalance());
		     break;
		}
		case 6:
		{
			System.out.println("Thank You for visiting");
			return;
		}
		default:{
			System.out.println("Please enter valid option");
			break;
		}
		
		
		}
	      
		
	    }
		
		catch (Exception e) {
			System.err.println("Invalid input Enter between 1-6:"+e);
		}
		
	    }
		
		
	   
	
	}
}
