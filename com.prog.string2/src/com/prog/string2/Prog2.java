package com.prog.string2;

import java.util.Scanner;

public class Prog2 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in)	;
		System.out.println("enter the string");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='1';
			}
			else if(ch[i]=='e')
			{
				ch[i]='2';
			}
			else if(ch[i]=='i')
			{
				ch[i]='3';
			}
			else if(ch[i]=='o')
			{
				ch[i]='4';
			}
			else if(ch[i]=='u')
			{
				ch[i]='5';
			}
			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
}

		
				