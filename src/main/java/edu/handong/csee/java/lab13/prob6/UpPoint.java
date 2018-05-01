package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint{ //UpPoint class that is included by interface CapitalPrint
	private int x,y; //Private int type variable x,y
	public UpPoint(int x, int y) { //constructor
		this.x = x; //this method's x =x
		this.y = y;// this method'x y =y

	}
	public String toString() { // toString method 
		return "X: "+x+ " Y: "+y;// return x,y information as upper case
	}
}
