package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.vky.entity.Employee;
import com.vky.entity.Student;
import com.vky.repo.EmployeeRepository;
import com.vky.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		StudentRepository studRepo = context.getBean(StudentRepository.class);
		
		/*
		Employee e1=new Employee(101,"Vaibhav Yadav",5000.00,"Male","Development");
		Employee e2=new Employee(102,"Ketan Bhuvad",4000.00,"Male","Testing");
		Employee e3=new Employee(103,"Rohan Vele",6000.00,"Male","Accounts");
		Employee e4=new Employee(104,"Snehal Raut",3000.00,"Female","Testing");
		Employee e5=new Employee(105,"Abhishek Gumare",4500.00,"Male","System");
		
		//repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5));
		//System.out.println("Record Saved...");
		
		List<Employee> allEmps = repo.findAll();
		//allEmps.forEach(System.out::println);
		
		Sort descendingsort = Sort.by("empSalary").descending();
		List<Employee> findAllEmps = repo.findAll(descendingsort);
		//findAllEmps.forEach(System.out::println);
		
		Sort byUsingDirection = Sort.by(Direction.ASC,"empName");
		List<Employee> emps = repo.findAll(byUsingDirection);
		//emps.forEach(System.out::println);
		
		Order ord1=new Order(Direction.ASC,"empSalary");
		Order ord2=new Order(Direction.DESC,"empName");
		Sort sortUsingOrd = Sort.by(Arrays.asList(ord1,ord2));
		List<Employee> orderemps = repo.findAll(sortUsingOrd);
		orderemps.forEach(System.out::println);*/
		
		//Data JPA Timestamping
		Student s1=new Student();
		s1.setStudId(101);
		//s1.setStudName("Vaibhav Yadav");
		s1.setStudEmail("yvaibhav746@gmail.com");
		studRepo.save(s1);
		
	}

}
