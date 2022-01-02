package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike toyota = new MotorBike(20);
		MotorBike honda = new MotorBike( );
		System.out.println(honda.getSpeed());
		honda.start();
		toyota.start();
		
		honda.setSpeed(100);
		System.out.println(honda.getSpeed());
		
		honda.increaseSpeed(100);
		System.out.println(honda.getSpeed());
		
		honda.decreaseSpeed(300);
		System.out.println(honda.getSpeed());

	}

}
