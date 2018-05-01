package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape { //announce Circle class that inherits Shape Class
	double radius; //double type variable radius
	public Circle(double radius) { //constructor  
		this.radius = radius; //this class's radius = radius
	}
	public double area() { //area method 
		return Math.PI * radius *radius; //return r*r*pi
	}
	public double perimeter() { //perimeter method 
		return 2.0*Math.PI* radius; //return 2*pi*r
	}
	public double getRadius() { //getRadius method
		return radius; //return radius
	}
}
