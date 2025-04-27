package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.vky.entity.Employee;
import com.vky.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		
		//Sorting Using Sort Object
		Sort sortDesc = Sort.by("empName").descending();
		List<Employee> emps = repo.findAll(sortDesc);
		//emps.forEach(System.out::println);
		
		Sort sortAsc = Sort.by(Direction.ASC,"empSalary");
		List<Employee> emps1 = repo.findAll(sortAsc);
		//emps1.forEach(System.out::println);
		
		Order ord1=new Order(Direction.ASC,"empId");
		Order ord2=new Order(Direction.DESC,"empName");
		Sort sortOrder = Sort.by(Arrays.asList(ord1,ord2));
		List<Employee> emp2 = repo.findAll(sortOrder);
		//emp2.forEach(System.out::println);
		
		//Paging using PageRequest Object
		int pageNo=4;
		PageRequest pr = PageRequest.of(pageNo-1, 2);
		Page<Employee> pageObj = repo.findAll(pr);
		List<Employee> pageEmps = pageObj.getContent();
		//pageEmps.forEach(System.out::println);
		
		
		//QueryByExample is use to create query according to our requirement.Create Employee object and as per provided variable it will create query for us. 
		Employee emp=new Employee();
		emp.setEmpGender("Male");
		
		Example<Employee> example = Example.of(emp);
		List<Employee> exampleEmps = repo.findAll(example);
//		exampleEmps.forEach(exp->System.out.println(exp));
		
		
		/*if(repo.insertEmployee(106, "Ravi Pal", 55000, "Male", "Linux")>0)
			System.out.println("Employee inserted successfully.");
		else
			System.out.println("Employee insertion failed.");*/
		
		/*if(repo.updateEmployeeSalaryById(15000, 106)>0)
			System.out.println("Employee salary updated successfully.");
		else
			System.out.println("Employee salary updation failed.");*/

		/*if(repo.deleteEmployeeByDepartment("Linux")>0)
			System.out.println("Employee deleted successfully.");
		else
			System.out.println("Employee deletion failed.");*/
		
		//System.out.println(repo.getEmployeeByEmployeeDepartment("Development"));
		
	}

}
