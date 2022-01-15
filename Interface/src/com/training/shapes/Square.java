package com.training.shapes;

public class Square implements Shape{
    public double side;
    
    
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		
		return side*side;
	}

	@Override
	public double getPerimeter() {
		
		return 4*side;
	}

	

}
