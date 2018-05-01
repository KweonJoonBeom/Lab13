package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{ //dog class that inherit animal class and is included pet interface
	public String food() { //String type food method
		return "(Dog!)" + "Sausage"; //return cat's food information
	}

}
