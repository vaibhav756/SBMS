package com.daoimpl;

public class UserDaoImpl {
	//Bean Life Cycle using Xml approach
	public void init()
	{
		System.out.println("Getting DB connection...");
	}
	
	public void getData()
	{
		System.out.println("Getting data from DB...");
	}
	
	public void destroy()
	{
		System.out.println("Closing DB connection...");
	}
	
}
