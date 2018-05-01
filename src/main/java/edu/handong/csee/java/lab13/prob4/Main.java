package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1,d1;
		
		Master m1 = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Scanner mys = new Scanner(System.in);
		System.out.println("Enter the cat name and dog name");
		c1 = mys.next();
		d1 = mys.next();
		
		cat.setName(c1);
		dog.setName(d1);
		
		System.out.println("Name: "+ cat.getName());
		Master.feed(cat);
		System.out.println("Name: "+ dog.getName());
		Master.feed(dog);
	}

}
