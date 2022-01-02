package com.in28minutes.oops;

public class Book {
	private int numOfCopies=0;
	void setnumOfCopies(int copies) {
		this.numOfCopies=copies;
		System.out.println(this.numOfCopies);
	}
	void read() {
		System.out.println("start");
	}
}
