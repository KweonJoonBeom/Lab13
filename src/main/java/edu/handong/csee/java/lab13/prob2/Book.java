package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idcount=0;
	private int id;	
	private String bookname;
	
	public Book(String name) {
		
		this.bookname = name;
		idcount++;
		this.id = idcount;
	}
	
	public String toString() {
		return "\n\tId:  " + id + "\n\tBook Name: " + bookname;
	}
	public void show() {
		
		System.out.println("<<<BOOK>>>" + this.toString());
	}
}
	
	
	