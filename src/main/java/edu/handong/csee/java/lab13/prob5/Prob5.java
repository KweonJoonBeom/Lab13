package edu.handong.csee.java.lab13.prob5;

public class Prob5 { //Prob5 class
	public static boolean equal(int [][] m1 ,int [][] m2) { //eqaul method that has boolean return type
		int count=0; //int type variable count 
		if(m1.length != m2.length)  //if length of m1 = length of m2
			return false; //return false 

		for(int i=0; i<m1.length; i++) { //for loop as variable i until i<m1.length
			for(int j=0; j<m1[i].length; j++) { //for loop as variable j
				if(m1[i][j] !=m2[i][j] )  //if not same m1 between m2 
					count++; //then count=count+1
			}
		}
		if(count>3) return false; //if count >3 return false 
		else return true; //else return true

	}

}
