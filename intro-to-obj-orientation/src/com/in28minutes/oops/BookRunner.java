package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book computer_programming = new Book();
		Book code = new Book();
		
		code.read();
		computer_programming.read();
		computer_programming.setnumOfCopies(100);
	}

}
