package com.in28minutes.oops.level2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan=new Fan("M1",1.2,"blue");
		// wrong fan.toString();
		System.out.println(fan);
		fan.isOn(true);
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
	}

}
