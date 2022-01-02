package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress=new Address("3869 MIRAMAR","LA JOLLA","92037"); // dont forget new
		Customer customer=new Customer("Jason",homeAddress);
		
		System.out.println(customer.getHomeAddress());
		
		Address workAddress=new Address("UCSD","LA JOLLA","92092");
		customer.setWorkAddress(workAddress);
		System.out.println(customer.getWorkAddress());
		
		System.out.println(customer);
	}

}
