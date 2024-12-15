package com.lab_banking_application;

public class InvalidAmountException extends RuntimeException {

	public InvalidAmountException(String str)
	{
		super(str);
	}
}
