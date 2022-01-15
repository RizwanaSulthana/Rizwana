package com.threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyThread extends Thread{
	
	private String infil;
	private String outfil;
	public FileCopyThread(String infil, String outfil) {
		super();
		this.infil = infil;
		this.outfil = outfil;
	}
	
	public void run()
	{
		try {
			FileInputStream fis=new FileInputStream(infil);
			FileOutputStream fos=new FileOutputStream(outfil);
			
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
		}
			 catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
				
				System.out.println("file " +infil +"copied to" +outfil);
			
	}
		
		
		

}
