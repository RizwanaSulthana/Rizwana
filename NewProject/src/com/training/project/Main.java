package com.training.project;

public class Main {
	public static void main(String[]args)
	{
		Department deptment=null;
		
		try {
			deptment=DeptDataStore.getDepartment(100);
		}
		catch(DepartmentException e)
		{
			deptment=new Department(100,"New Deptment");
		}
		Employee e;
		try {
			e=new Employee(100,"Rani",30000,deptment);
			
			e.display();
			System.out.println("=======changing salary===========");
			e.setSalary(40000);
			e.display();
		}
		catch(SalaryException e1)
		{
			System.out.println(e1.getMessage());
			
		}
	}
}


