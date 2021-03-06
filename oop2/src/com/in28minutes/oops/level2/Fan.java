package com.in28minutes.oops.level2;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;//false default
	private byte speed; //0-5
	
	public Fan(String make, double radius, String color) {
		this.color=color;
		this.make=make;
		this.radius=radius;
		
		
	}
	
	public String toString() {
		return String.format("make - %s, radius - %f, color-%s, isOn-%b,speed- %d",this.make,this.radius,this.color,this.isOn,this.speed);
	}
	
	//isOn
	public void isOn(boolean isOn) {
		this.isOn=isOn;
	}
	
	public void switchOn() {
		this.isOn=true;
		setSpeed((byte)5);
	}
	
	public void switchOff() {
		this.isOn=false;
		setSpeed((byte)0);;
	}
	
	public void setSpeed(byte speed) {
		this.speed=speed;
	}

}
