package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestringApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("PetrolEngine is singlton bean.IOC create only one object for singleton bean.");
		PetrolEngine petrolBean1 = context.getBean(PetrolEngine.class);
		System.out.println(petrolBean1.hashCode());
		
		PetrolEngine petrolBean2 = context.getBean(PetrolEngine.class);
		System.out.println(petrolBean2.hashCode());
		
		System.out.println("\nDieselEngine is prototype bean.IOC creates separate beans when we define scope as \"Prototype\".");
		DieselEngine dieselBean1 = context.getBean(DieselEngine.class);
		System.out.println(dieselBean1.hashCode());
		DieselEngine dieselBean2 = context.getBean(DieselEngine.class);
		System.out.println(dieselBean2.hashCode());
	}

}
