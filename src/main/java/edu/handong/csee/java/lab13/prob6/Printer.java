package edu.handong.csee.java.lab13.prob6;

public class Printer {//printer class
	public static void show(Object object) { //static void type method show 
		String str = object.toString(); //String type variable str = parameter object.toString 
		if(object instanceof CapitalPrint) //if object is Upper case
			System.out.println(str.toUpperCase()); //print out Upper case
		else System.out.println(str); //else print out lower case
	}

}
