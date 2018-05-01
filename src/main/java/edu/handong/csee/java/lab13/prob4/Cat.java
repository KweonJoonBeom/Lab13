package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{ //Cat class that inherit animal class and is included pet interface
	public String food() { //String type food method
		return "(Cat!)" + "Fish"; // return cat's food information
	}
}
