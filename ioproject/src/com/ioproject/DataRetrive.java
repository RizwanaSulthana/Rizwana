package com.ioproject;

import java.io.*;

public class DataRetrive {
	
	public static void main(String[]args) 
	{
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("D:/values.data"));
			
			int x=dis.readInt();
			float f=dis.readFloat();
			double d=dis.readDouble();
			
			System.out.println(x);
			System.out.println(f);
			System.out.println(d);
			
			dis.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
