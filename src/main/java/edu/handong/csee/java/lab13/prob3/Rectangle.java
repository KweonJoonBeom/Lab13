package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {
	private double lenth;
	private double width;
	public Rectangle(double lenth,double width) {
		this.lenth = lenth;
		this.width = width;
	}
	public double area(){
		return lenth*width;
	}
	public double perimeter(){
		return (lenth+width)*2;
	}
	public double getLenth() {
		return lenth;
	}
	public double getWidth() {
		return width;
	}
	
	
}

