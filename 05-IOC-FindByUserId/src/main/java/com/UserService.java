package com;

public class UserService {

	UserDao dao;
	
	public UserService()
	{
		
	}
	
	public UserService(UserDao dao)
	{
		System.out.println("Constructor Injection Invoke.");
		this.dao=dao;
	}
	
	public void setDao(UserDao dao)
	{
		System.out.println("Setter Injection Invoke.");
		this.dao=dao;
	}
	
	
	public void printName(Integer id)
	{
		String name = dao.findById(id);
		System.out.println("User with id : "+id+" is : "+name);
	}
	
}
