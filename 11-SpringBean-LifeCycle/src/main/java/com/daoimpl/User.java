package com.daoimpl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean,DisposableBean{

	//Bean Life Cycle using Programming approach
	public void afterPropertiesSet() throws Exception {
		System.out.println("User Bean Initialization done...");
	}
	
	public void getData()
	{
		System.out.println("Getting data from DB...");
	}

	public void destroy() throws Exception {
		System.out.println("User Bean Destroyed...");
	}

	
}
