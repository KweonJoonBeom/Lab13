package edu.handong.csee.java.lab13.prob2;

public class History extends Book { //History Class inherit Book class
	private String author; // private String type variable author
	public History(String name, String name2) { // History class's constructor 
		super(name); //use ancestor class's constructor
		this.author=name2; //this class's author = name2

	}
	public String toString() { //toString method in History class 
		return super.toString() + "\n\tAuthor: " + author; //use ancestor's method toString and return
	}
	public void show() { //show method
		System.out.println("<<<History>>>" + this.toString()); //print out History and toString's return information
	}
}
