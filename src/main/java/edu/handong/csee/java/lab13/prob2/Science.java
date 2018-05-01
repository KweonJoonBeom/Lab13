package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {//announce Science class that inherits Book class 
	private String publisher; //private String type publisher
	public Science(String name,String name2) { //constructor of Science Class
		super(name); // use ancestor's constructor
		this.publisher = name2; //this class's publisher = name2

	}
	public String toString() { //toString method that has return of String type 
		return super.toString() + "\n\tPublisher: " + publisher; //return ancestor's toString and publisher information
	}
	public void show() { //show method
		System.out.println("<<<Science>>>" + this.toString()); //print out Science and that information
	}
}
