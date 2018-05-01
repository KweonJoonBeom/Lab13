package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner; //import scanner's method

public class Main { //main class

	public static void main(String[] args) { //main
		// TODO Auto-generated method stub
		int r1,r2,c1,c2; //int type variable r1,r2,c1,c2

		Scanner mys = new Scanner(System.in); //instance scanner method as mys variable
		System.out.println("Enter the row size(maximum 5): " ); //print out
		r1 = mys.nextInt(); //inputed by user and store in r1
		System.out.println("Enter the colum size(maximum 5): "); //print out
		c1 = mys.nextInt(); //inputed by user and store in c1

		System.out.println("Enter the row size(maximum 5): " ); //print out 
		r2 = mys.nextInt(); //inputed by user and store in r2
		System.out.println("Enter the colum size(maximum 5): "); // print out 
		c2 = mys.nextInt(); //inputed by user and store in c2

		int [][] list1 = new int[r1][c1]; // instance list as list1
		int [][] list2 = new int[r2][c2]; //instance list as list2

		System.out.println("Enter List1: "); //print out 
		for(int i=0; i<r1; i++) { //for loop as variable i until i<r1 and i=i+1 when end each loops
			for(int j=0; j<c1; j++) { //for loop as variable j
				list1[i][j] = mys.nextInt(); //inputed by user and stored in list1[i][j]
			}
		}

		System.out.println("Enter List2: "); //print out 
		for(int i=0; i<r2; i++) { //for loop as variable i until i<r2 and i=i+1 when end each loops
			for(int j=0; j<c2; j++) {//for loop as variable j
				list2[i][j] = mys.nextInt();//inputed by user and stored in list2[i][j]
			}
		}

		for(int i=0; i<r1; i++) { //for loop as i until i<r1
			System.out.println(""); //print out new line 
			for(int j=0; j<c1; j++) { //for loop as j until j<c1
				System.out.print(list1[i][j]+ " "); //print out list1's contents

			}
		}

		System.out.println(""); //print out new line 
		for(int i=0; i<r2; i++) { //for loop as i until i<r2
			System.out.println(""); // print out new line 
			for(int j=0; j<c2; j++) { //for loop as j until j<c2
				System.out.print(list2[i][j]+ " "); //print out list2's contents

			}
		}
		System.out.println(""); //print out newline 
		if(Prob5.equal(list1,list2))  //if list1=list2 using equal method
			System.out.println("The two arrays approximatily identical"); //print out identical message
		else //else
			System.out.println("The two arrays are not identical"); //print out not identical message

	}


}
