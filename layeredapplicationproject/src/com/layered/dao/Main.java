package com.layered.dao;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.layered.entity.Employee;
import com.layered.exception.ServiceException;
import com.layered.service.EmployeeService;
import com.layered.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		EmployeeService service =new EmployeeServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int eid =sc.nextInt();
		Employee x=service.getEmployee(eid);
		if(x!=null)
			System.out.println(x);
		else
			System.out.println("employee not found");
		
		System.out.println("=============list of all employees==========");
		List<Employee> lst=service.getAllEmployees();
		for(Employee e:lst)
			System.out.println(e);
		
		System.out.println("===========changing salary=====");
		System.out.println("enter low salary and high salary");
		float low=sc.nextFloat();
		float high =sc.nextFloat();
		
		lst=service.getAllwithsalaryRange(low, high);
		for(Employee e:lst)
			System.out.println(e);
		System.out.println("=====delete employee====");
		System.out.println("enter empid to delete");
		eid=sc.nextInt();
		
		try {
			service.deleteEmployee(eid);
			System.out.println("employee object seccessfully completed");
		} catch (ServiceException e1) {
			System.out.println("delete fail" +e1.getMessage());
		}
		/*
		
	Employee e1=new Employee(999,"abcdef",60000);
		try {
			service.createEmployee(e1);
			System.out.println("data successfully saved");
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
			
			/*e2.printStackTrace();
		}
		System.out.println("data successfully saved");
	
	
		

		
	List<Employee> lst1=service.getAllEmployees();
		for(Employee e:lst1)
		System.out.println(e);
		*/
			
		
	}

}
