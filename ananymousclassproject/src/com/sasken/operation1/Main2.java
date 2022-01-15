package com.sasken.operation1;

import com.sasken.operation.StringOps;

public class Main2 {
	
	public static void main(String[]args)
	{
		StringOps s1=new StringOps() {
			public String convert(String str) {
				return new StringBuilder(str).reverse().toString();
			
			}
		}; 
		System.out.println(s1.convert("bye"));
		
		StringOps s2=new StringOps() {
			public String convert(String str) {
				return str.substring(str.length()-2);
			
			}
		}; 
			System.out.println(s2.convert("Rizwana"));
			
			StringOps s3=new StringOps() {
				public String convert(String str) {
					return str.substring(0,str.length()/2);
					
				
				}
			}; 
			System.out.println(s3.convert("Rizwana Sulthana"));
			
		
	}

}
