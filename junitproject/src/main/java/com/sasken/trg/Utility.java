package com.sasken.trg;

public class Utility {
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public int subtract(int x,int y)
	{
		return x-y;
		
	}
	
	public void checkNumber(int a) {
		
		if(a>50)
			throw new ArithmeticException();
		System.out.println("number: " +a);
	}
	
	int sumArray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
		
		}
	public boolean checkPalindrome(int num) {
		
		String str=String.valueOf(num);
		String str1=new StringBuilder(str).reverse().toString();
		if(str.equals(str1))
			return true;
		return false;
		
	}

}
