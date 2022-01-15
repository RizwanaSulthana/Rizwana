package com.ioproject;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextIO {
	
	public static void main(String[]args)
	{
		
		try {
			FileReader fr=new FileReader("C:\\Users\\sasken\\eclipse-workspace\\weekendproject\\bin\\com\\weekendproject\\Main.class");
			FileWriter fw=new FileWriter("D:Main.class");
			
			System.out.println("files opened");
			
			int b=0;
			while(true)
			{
				b=fr.read();
				if(b==-1)
				break;
				fw.write(b);;
			}
			fr.close();
			fw.close();
			
			} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("file copy completed");
		
	}

}


