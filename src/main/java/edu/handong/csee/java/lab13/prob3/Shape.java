package edu.handong.csee.java.lab13.prob3;

public abstract class Shape { //announce abstract class Shape
	public abstract double area(); //abstract double type area
	public abstract double perimeter(); //abstract double tye perimeter

	public void display() { //display method
		System.out.println("Area: " + area() + "\nPerimeter: "+ perimeter() + "\n"); //print out area and perimeter information
	}

}
