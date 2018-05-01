package edu.handong.csee.java.lab13.prob1;

public class InstanceOf { //public class InstanceOf 
	
	public static void whatFriend(Friend friend) { //whatFriend method in InstanceOf class
		if(friend instanceof ClassFriend)  //if ClassFriend inherit Friend Class
			((ClassFriend)friend).classFriends(); // then use classFriends method
			
		else if(friend instanceof SchoolFriend) //if SchoolFriend inherit friend Class
			((SchoolFriend)friend).schoolFriend();//then use schoolFriend method
		else  //else
			friend.justFriend(); //then use justFriend method in other Class
		
	}
	
}
