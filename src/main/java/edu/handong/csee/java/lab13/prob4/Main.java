package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner; //import Scanner methods
public class Main { //main class

	public static void main(String[] args) { //main
		// TODO Auto-generated method stub
		String c1,d1; //String type variable c1,d1

		Master m1 = new Master(); // instance Master class as m1
		Cat cat = new Cat(); // instance Cat class as cat 
		Dog dog = new Dog(); // instance Dog class as dog

		Scanner mys = new Scanner(System.in); //instance Scanner method as mys
		System.out.println("Enter the cat name and dog name"); //print out Enter the cat name and dog name
		c1 = mys.next(); // inputed by user 
		d1 = mys.next(); // inputed by user 

		cat.setName(c1); //set cat's name
		dog.setName(d1); // set dog's name

		System.out.println("Name: "+ cat.getName()); //print out cat name 
		Master.feed(cat); //use feed method in master class
		System.out.println("Name: "+ dog.getName()); //print out dog name
		Master.feed(dog); //use feed method in master class
	}

}
