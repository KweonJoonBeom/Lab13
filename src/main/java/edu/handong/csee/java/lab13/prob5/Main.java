package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1,r2,c1,c2;
		
		Scanner mys = new Scanner(System.in);
		System.out.println("Enter the row size(maximum 5): " );
		r1 = mys.nextInt();
		System.out.println("Enter the colum size(maximum 5): ");
		c1 = mys.nextInt();
		
		System.out.println("Enter the row size(maximum 5): " );
		r2 = mys.nextInt();
		System.out.println("Enter the colum size(maximum 5): ");
		c2 = mys.nextInt();
		
		int [][] list1 = new int[r1][c1];
		int [][] list2 = new int[r2][c2];
		
		System.out.println("Enter List1: ");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				list1[i][j] = mys.nextInt();
			}
		}
		
		System.out.println("Enter List2: ");
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				list2[i][j] = mys.nextInt();
			}
		}
		
		for(int i=0; i<r1; i++) {
			System.out.println("");
			for(int j=0; j<c1; j++) {
				System.out.print(list1[i][j]+ " ");
				
			}
		}
		
		System.out.println("");
		for(int i=0; i<r2; i++) {
			System.out.println("");
			for(int j=0; j<c2; j++) {
				System.out.print(list2[i][j]+ " ");
				
			}
		}
		System.out.println("");
		if(Prob5.equal(list1,list2)) 
			System.out.println("The two arrays approximatily identical");
		else 
			System.out.println("The two arrays are not identical");
		
	}
	

}
