package com.training.project;

import java.io.Serializable;

public class Department implements Serializable{
	private int deptId;
	private String deptName;
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	
	public void display()
	{
		System.out.println("Deptment Id: " + deptId);
		System.out.println("Department name:" +deptName);
	}
	
	


}
