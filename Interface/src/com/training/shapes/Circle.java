package com.training.shapes;
import static java.lang.Math.PI;

public class Circle implements Shape {
	private double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return PI*(radius*radius);
	}

	@Override
	public double getPerimeter() {
		
		return 2*PI*radius;
	}
	
	

}
