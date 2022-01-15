package com.ioproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {
	
	public static void main(String[]args)
	{
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\sasken\\eclipse-workspace\\weekendproject\\bin\\com\\weekendproject\\New.class");
			FileOutputStream fos=new FileOutputStream("D:New.class");
			
			System.out.println("files opened");
			
			int b=0;
			while(true)
			{
				b=fis.read();
				if(b==-1)
				break;
				fos.write(b);;
			}
			fis.close();
			fos.close();
			
			} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("file copy completed");
		
	}

}
