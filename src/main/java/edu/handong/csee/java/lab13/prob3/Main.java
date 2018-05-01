package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double n1,n2,n3;
		// TODO Auto-generated method stub
		Scanner mys = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		n1 = mys.nextDouble();
		Circle c1 = new Circle(n1);
		System.out.println("Radius: "+ c1.getRadius());
		c1.display();
		
		System.out.println("Enter length and width: ");
		n2 = mys.nextDouble();
		n3 = mys.nextDouble();
		Rectangle r1 = new Rectangle(n2,n3);
		System.out.println("Length: "+ r1.getLenth());
		System.out.println("Width: "+ r1.getWidth());
		r1.display();
	}

}
