package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[]args)
	{
		Date d=new Date();
		//System.out.println(d);
	    
		Date dob=new Date(99,5,6);//here we need to subtract the 2 digiits hundred of year
		System.out.println(dob);
		System.out.println(dob.getMonth());
		System.out.println(dob.getYear());
		
		long millis=System.currentTimeMillis();
		Date today=new Date(millis);
		System.out.println(today);
		
		SimpleDateFormat df=new SimpleDateFormat("dd-MMMM-YYYY");
		System.out.println(df.format(dob));
		
	
	
	}

}
