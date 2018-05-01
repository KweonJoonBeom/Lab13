package edu.handong.csee.java.lab13.prob1;

public class Main { //Main class

	public static void main(String[] args) { //main 
		// TODO Auto-generated method stub
		Friend friend1 = new Friend(); // instance Friend class variable friend1
		ClassFriend friend2 = new ClassFriend(); //instance ClassFriend class variable friend2
		SchoolFriend friend3 = new SchoolFriend(); // instance SchoolFriend class variable friend3

		InstanceOf.whatFriend(friend1); // use whatFriend method that is in InstanceOf class as parameter friend1
		InstanceOf.whatFriend(friend2);//use whatFriend method that is in InstanceOf class as parameter friend2
		InstanceOf.whatFriend(friend3);//use whatFriend method that is in InstanceOf class as parameter friend3
	}

}
