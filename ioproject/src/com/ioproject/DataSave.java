package com.ioproject;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataSave {
	public static void main(String []args)
	{
		int x=100;
		float f=12.34f;
		double d=1.2;
		
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:/values.data"));
			
			dos.writeInt(x);
			dos.writeFloat(f);
			dos.writeDouble(d);
			
			dos.close();
			System.out.println("values saved in D:/values.data file ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
