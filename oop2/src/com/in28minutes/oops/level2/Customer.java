package com.in28minutes.oops.level2;

public class Customer {
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//creating
	public Customer(String name, Address homeAddress) {
		this.name=name;
		this.homeAddress=homeAddress;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	
	public Address getWorkAddress() {
		return workAddress;
	}
	
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress=homeAddress;
	}
	
	public void setWorkAddress(Address workAddress) {
		this.workAddress=workAddress;
	}
	
	public String toString() {
		return String.format("name - [%s], homeAddress - [%s], workAddress-[%s]",this.name,this.homeAddress,this.workAddress);
	}
	
}
