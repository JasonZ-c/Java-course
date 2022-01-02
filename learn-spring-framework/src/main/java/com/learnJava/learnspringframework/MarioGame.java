package com.learnJava.learnspringframework;

import org.springframework.stereotype.Component;

@Component

public class MarioGame implements GameConsole {
	@Override
	public void up() {
		System.out.println("jump");
	}
	@Override
	public void down() {
		System.out.println("go into hole");
	}
	@Override
	public void left() {
		System.out.println("back");
	}
	@Override
	public void right() {
		System.out.println("run");
	}

}
