package com.sasken.operation1;

import com.sasken.operation.AddOperation;
import com.sasken.operation.MathOperation;
import com.sasken.operation.MultipleOperation;
import com.sasken.operation.SubtractOperation;

public class Main1 {
	
	public static void main(String[]args)
	{
		/*MathOperation m1=new AddOperation();
		System.out.println(m1.doOperation(50,30));
		
		MathOperation m2=new SubtractOperation();
		System.out.println(m2.doOperation(50, 30));
		
		MathOperation m3=new MultipleOperation();
		System.out.println(m3.doOperation(50, 30));
		*/
		
		
		MathOperation m1=new MathOperation() {
			
			@Override
			public int doOperation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		System.out.println(m1.doOperation(90, 50));
		
		MathOperation m2=new MathOperation() {
			
			@Override
			public int doOperation(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		
		System.out.println(m2.doOperation(90, 50));
		
		MathOperation m3=new MathOperation() {
			
			@Override
			public int doOperation(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		System.out.println(m3.doOperation(10, 6));
		
	}

}
