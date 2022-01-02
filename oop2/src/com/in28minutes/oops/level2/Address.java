package com.in28minutes.oops.level2;

public class Address {
	private String line1;
	private String city;
	private String zip;
	
	//creating
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	public String toString() {
		return String.format("line1 - %s, city - %s, zip-%s",this.line1,this.city,this.zip);
	}

}
