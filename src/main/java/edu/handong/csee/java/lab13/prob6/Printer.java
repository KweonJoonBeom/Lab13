package edu.handong.csee.java.lab13.prob6;

public class Printer {
	public static void show(Object object) {
		String str = object.toString();
		if(object instanceof CapitalPrint)
			System.out.println(str.toUpperCase());
		else System.out.println(str);
	}

}
