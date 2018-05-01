package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner; //import Scanner method
public class Main { //main class

	public static void main(String[] args) { //main
		double n1,n2,n3; //double type variable n1,n2,n3
		// TODO Auto-generated method stub 
		Scanner mys = new Scanner(System.in); //instance scanner method

		System.out.println("Enter the radius: "); //print out enter the radius
		n1 = mys.nextDouble(); //n1 = input number
		Circle c1 = new Circle(n1); //instance Circle class's variable c1
		System.out.println("Radius: "+ c1.getRadius()); //print out radius
		c1.display(); //use display method 

		System.out.println("Enter length and width: "); //print out enter length and width
		n2 = mys.nextDouble(); // n2 =double type number inputted by user 
		n3 = mys.nextDouble(); // n3 =double type number inputted by user
		Rectangle r1 = new Rectangle(n2,n3); //instance Rectangle class as r1
		System.out.println("Length: "+ r1.getLength()); //print out length
		System.out.println("Width: "+ r1.getWidth()); // print out width
		r1.display(); //use display method of r1
	}

}
