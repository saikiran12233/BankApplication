package com.lab_banking_application;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends RuntimeException {

	public LoanNotAllowedException(String str)
	{
		super(str);
	}
}
