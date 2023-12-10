package com;

public class Greeting {

	Language lang;
	
	//Setter Injection
	/*public void setLanguage(Language lang)
	{
		this.lang=lang;
	}*/
	
	//Constructor Injection
	/*public Greeting(Language lang)
	{
		this.lang=lang;
	}*/
	
	//Field Injection
	
	public void greet()
	{
		lang.greeting();
	}
	
}
