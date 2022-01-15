package com.prog.string2;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(char ch:s.toCharArray())
		{
			switch(ch)
			{
			case '0':System.out.print("zero");
			break;
			case '1':System.out.print("one");
			break;
			case '2':System.out.print("two");
			break;
			case '3':System.out.print("three");
			break;
			case '4':System.out.print("four");
			break;
			case '5':System.out.print("five");
			break;
			case '6':System.out.print("six");
			break;
			case '7':System.out.print("seven");
			break;
			case '8':System.out.print("eight");
			break;
			case '9':System.out.print("nine");
			break;
			
			
			}
			if(!(Character.isDigit(ch)))
			{
				System.out.print(ch);
			}
		}
		
	}

}
