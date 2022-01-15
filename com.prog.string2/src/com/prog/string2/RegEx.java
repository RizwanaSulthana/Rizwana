package com.prog.string2;
	import java.util.Scanner;

	public class RegEx {
		public static void main (String[]args)
		{
			{
			Scanner sc=new Scanner(System.in);
					String str=sc.nextLine();
					
					if(str.matches(".*[0-9].*"))
					{
						System.out.println("string contains digits");
					}
					else
						System.out.println("no string");
					
			
		}
		}

	}



