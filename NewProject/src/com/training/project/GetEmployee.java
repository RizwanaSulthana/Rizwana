package com.training.project;

import java.io.*;

public class GetEmployee {
	public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D://Employee.data"));
		
		Employee x=(Employee) ois.readObject();
		
		ois.close();
		
		x.display();
		
		
	}

}
