package com.practice;

import java.util.Objects;

public class Employee {
	private int empId;
	private String ename;
	private int salary;
	
	public Employee(int empId, String ename, int salary) 
	{
		super();
		
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		
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
		
		this.salary = salary;
		}
	
	public int getEmpId() {
		return empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}
	}



