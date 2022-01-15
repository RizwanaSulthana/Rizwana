package com.layered.service;

import java.util.List;

import com.layered.entity.Employee;
import com.layered.exception.ServiceException;

public interface EmployeeService {

	
	Employee getEmployee(int empId);
	List<Employee>  getAllEmployees();
	void raiseSalary(int empId,float percent) throws ServiceException;
	float getTotalSalary();
	void deleteEmployee(int empId) throws ServiceException;
	List<Employee> getAllwithsalaryRange(float min,float max);
	void createEmployee(Employee e) throws ServiceException;
	
}
