package com.lab_banking_application;

public interface Bank {

	
        void deposit(double amount);
	
	   void withDraw(double amount);
	
	     void transfer(BankAccount bankAccount,double amount);
	
	   void applyForLoan(double amount);
	
	

}
