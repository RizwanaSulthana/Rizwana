package com.practice;

import java.io.Console;

public class Main2 {
	public static void main(String[]args)
	{
		Console con=System.console();
		System.out.println("enter the name:");
		
		String userName=con.readLine();
		System.out.println("enter the password:");
		
		char [] pwd = con.readPassword();
		
		System.out.println("your name: " + userName);
		System.out.println("your password: " + new String(pwd));
		
	}

}
