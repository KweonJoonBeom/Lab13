package edu.handong.csee.java.lab13.prob6;

public class Main { //main class

	public static void main(String[] args) { //main
		// TODO Auto-generated method stub
		UpPoint p1 = new UpPoint(3,4); //instance UpPoint class as variable p1
		UpPoint p2 = new UpPoint(5,3); //instance UpPoint class as variable p2
		DownPoint p3 = new DownPoint(8,4); //instance DownPoint class as variable p3
		DownPoint p4 = new DownPoint(4,2); //instance DownPoint class as variable p4

		Printer.show(p1); //use show method of Printer as parameter p1
		Printer.show(p2);//use show method of Printer as parameter p2
		Printer.show(p3);//use show method of Printer as parameter p3
		Printer.show(p4);//use show method of Printer as parameter p4
	}

}
