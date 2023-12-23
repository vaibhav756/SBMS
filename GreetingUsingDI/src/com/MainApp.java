package com;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number as per language given bellow\n"
				+ "1.Marathi\n"
				+ "2.English\n"
				+ "3.Hindi\n");

		
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
		int val=sc.nextInt();
		if(val==1)
		grt.lang=new Marathi();
		else if(val==2)
		grt.lang=new English();
		else
		grt.lang=new Hindi();
		grt.greet();
		
	}

}
