package edu.handong.csee.java.lab13.prob2;

public class Main { //Main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		History book = new History("MJ","KD"); //instance book variable in History class
		Book book1 = new Book("Justice"); // instance Book class variable as book1
		History book2 = new History("History of Korea","Jung"); // instance History class variable as book2
		Science book3 = new Science("Elementry Phsics","JOHNSON"); //instance Science class variable as book3

		book.show(); //use show method
		book1.show(); // use show method 
		book2.show();//use show method
		book3.show(); //use show method 

	}

}
