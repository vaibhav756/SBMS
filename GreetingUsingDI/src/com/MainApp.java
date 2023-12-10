package com;

public class MainApp {

	public static void main(String[] args) {

		
		
		//Setter Injection
		//Greeting grt=new Greeting();
		//grt.setLanguage(new Marathi());
		//grt.setLanguage(new Hindi());
		//grt.setLanguage(new English());
		//grt.greet();
		
		//Constructor Injection
		//Greeting grt=new Greeting(new Marathi());
		//Greeting grt=new Greeting(new Hindi());
		//Greeting grt=new Greeting(new English());
		//grt.greet();
		
		//Field Injection
		Greeting grt=new Greeting();
		grt.lang=new Marathi();
		grt.greet();
		
	}

}
