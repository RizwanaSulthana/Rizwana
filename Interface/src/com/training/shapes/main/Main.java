package com.training.shapes.main;

import com.training.shapes.Circle;
import com.training.shapes.Rectangle;
import com.training.shapes.Shape;
import com.training.shapes.Square;

public class Main {
	public static void main(String[]ags)
	{
		Circle c=new Circle(2.3);
		displayDetails(c);
		
		Rectangle r=new Rectangle(20,34);
		displayDetails(r);
		
		Square s=new Square(2.4);
		displayDetails(s);
		
		
		
		
	}
	
	
	static void displayDetails(Shape s)
	{
		
		if(s instanceof Circle )
		{
			System.out.println("Details of circle");
		}
		if(s instanceof Rectangle )
		{
			System.out.println("Details of rectangle");
		}
		if(s instanceof Square )
		{
			System.out.println("Details of square");
		}
		double area=s.getArea();
		double peri=s.getPerimeter();
		
		System.out.println("area: " +area);
		System.out.println("perimeter:" +peri);
		
	}
	

}
