package com.training.shapes;

import java.util.Scanner;

public class RegEx {
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
				String str=sc.nextLine();
				
				/*if(str.matches(".*[0-9].*"))
				{
					System.out.println("string contains digits");
				}
				else
					System.out.println("no string");
					*/
				if(str.matches("[A-Za-z0-9_]*@[A-Za-z]{3,10}\\.[a-zA-z]{2,3}"))
				{
					System.out.println("string is valid emailid");
				}
				else
					System.out.println("invalid email");
				
		
	}
	}


