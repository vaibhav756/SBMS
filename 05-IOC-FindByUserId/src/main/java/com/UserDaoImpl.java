package com;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {

	public String getName(Integer id)
	{
		Map<Integer,String> names=new HashMap<>();
		names.put(101,"Vaibhav Yadav");
		names.put(102,"Rohan Vele");
		names.put(103,"Ketan Bhuvad");
		names.put(104,"Amit Devkar");
		names.put(105,"Kiran Yadav");
		return names.get(id);
		
	}
	
	public String findById(int id) {
		return getName(id);
	}

}
