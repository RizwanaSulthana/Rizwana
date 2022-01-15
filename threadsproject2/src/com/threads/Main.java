package com.threads;

public class Main {
	
	public static void main(String[]args)
	{
		FileCopyThread ft1=new FileCopyThread("C:\\Users\\sasken\\Pictures\\Saved Pictures//bird.jfif", "D://file1copy");
		
		FileCopyThread ft2=new FileCopyThread("C:\\Users\\sasken\\Pictures\\Saved Pictures//bird2.jfif", "D://file2copy");
		
		ft1.start();
		ft2.start();
		
		
	}

}
