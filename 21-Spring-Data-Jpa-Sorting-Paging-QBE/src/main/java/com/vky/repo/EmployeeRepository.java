package com.vky.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vky.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	@Transactional
	@Modifying
	@Query(value="insert into employee(employee_id,employee_name,employee_salary,employee_gender,employee_department) values(?,?,?,?,?)",nativeQuery=true)
	public Integer insertEmployee(Integer empId,String empName,Integer empSalary,String empGender,String empDepartment);
	
	@Transactional
	@Modifying
	@Query(value="update employee set employee_salary=? where employee_id=?",nativeQuery=true)
	public Integer updateEmployeeSalaryById(Integer empSalary,Integer empId);
	
	@Transactional
	@Modifying
	@Query(value="delete from employee where employee_department=?",nativeQuery=true)
	public Integer deleteEmployeeByDepartment(String empDept);
	
	@Query(value="select * from employee where employee_department=?",nativeQuery=true)
	public Employee getEmployeeByEmployeeDepartment(String department);
	
}
