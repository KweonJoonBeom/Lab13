package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI * radius *radius;
	}
	public double perimeter() {
		return 2.0*Math.PI* radius;
	}
	public double getRadius() {
		return radius;
	}
}
