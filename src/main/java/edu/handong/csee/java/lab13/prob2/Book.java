package edu.handong.csee.java.lab13.prob2;

public class Book { //Book class
	private static int idcount=0; // private static int type variable idcount and this value is 0
	private int id;	 //private int type variable id
	private String bookname;//private String type variable bookname;

	public Book(String name) { //Constructor of Book class

		this.bookname = name; // this class's bookname = name
		idcount++; //idcount=idcount+1
		this.id = idcount; // this class's id = idcount
	}

	public String toString() { //return String that contains id and bookname information
		return "\n\tId:  " + id + "\n\tBook Name: " + bookname; // return id and bookname string
	}
	public void show() { //display method

		System.out.println("<<<BOOK>>>" + this.toString());// print out book and return information in toString method	
	}
}


