package com.practice.main;

import com.practice.Employee;

public class Main {
	
	public static void main(String[]args)
	{
		Employee e1=new Employee(1,"Riz" ,30000);
		Employee e2=new Employee(2,"Riz" ,30000);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.getClass().getName());
		
	}

}
