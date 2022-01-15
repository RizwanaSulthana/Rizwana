package com.training.project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveEmployee {
	public static void main(String[]args) throws SalaryException, FileNotFoundException, IOException
	{
		Department dept=new Department(100, "technical");
		Employee emp=new Employee(101, "suresh", 30000, dept);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D://Employee.data"));
		
		oos.writeObject(emp);
		System.out.println("object saved ");
		
		oos.close();
		
		
		
		
		
		
	}

}
