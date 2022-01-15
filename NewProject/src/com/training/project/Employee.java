package com.training.project;

import java.io.Serializable;

public class Employee  implements Serializable
{
	private int empId;
	private String ename;
	private int salary;
	private Department department;
	Employee(int empId, String ename, int salary,Department department) throws SalaryException
	{
		super();
		if(salary<25000)
		{
			throw new SalaryException("salary cannot be less than 25000");
		}
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if(salary < this.salary)
		System.out.println("Salary cannot be less than existing salary" +this.salary);
		else
		this.salary = salary;
		}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void display()
	{
		System.out.println("name: " + ename);
		System.out.println("employee id: " + empId);
		System.out.println("salary: " + salary);
		System.out.println("department: " + department);
		department.display();
	}
	

}
