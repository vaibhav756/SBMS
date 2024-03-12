package com.exception;

public class ContactNotFoundException extends Exception{

	public ContactNotFoundException() {
	}
	
	public ContactNotFoundException(String msg)
	{
		super(msg);
	}
	
}
