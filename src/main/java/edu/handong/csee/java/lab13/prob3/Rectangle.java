package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape { //announce Rectangle class that inherits Shape class
	private double length; //private double type variable length
	private double width; // private double type variable width
	public Rectangle(double length,double width) { //constructor 
		this.length = length; //this class's length = length
		this.width = width; //this class's width = width
	}
	public double area(){ // area method
		return length*width; //return length*width
	}
	public double perimeter(){ //perimeter method
		return (length+width)*2; //return (length+width)*2
	}
	public double getLength() { //getLength method
		return length; //return length
	}
	public double getWidth() { //getWidth method
		return width; //return width
	}


}

