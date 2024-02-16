package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.EmployeeJoiningDto;
import com.entity.EmployeeJoiningEntity;
import com.repo.EmployeeJoiningRepo;

@Service
public class EmployeeJoiningService {

	@Autowired
	private EmployeeJoiningRepo repo;
	
	public List<String> getEmployeeDept()
	{
		return Arrays.asList("Account","Developmenet","Testing","BO","Marketing","Networking");
	}
	
	public List<String> getEmployeeShift()
	{
		return Arrays.asList("Morning","Afternoon","Evening");
	}

	public boolean saveEmployee(EmployeeJoiningDto dto) {
		
		EmployeeJoiningEntity entity=new EmployeeJoiningEntity();
		BeanUtils.copyProperties(dto,entity);
		repo.save(entity);
		return true;
	}
	
}
