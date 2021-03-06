package com.in28minutes.oops;

public class MotorBike {
	private int speed; // default 0
	
	
	MotorBike(){
		this(5);
	}
	
	MotorBike(int speed){
		this.speed=speed;
	}
	
	
	public int getSpeed() {
		return speed;
	}




	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
		else {
			System.out.println("wrong speed given");
		}
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed+howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed-howMuch);
	}




	void start() {
		System.out.println("bike started");
	}
}
