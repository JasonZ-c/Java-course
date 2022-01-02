package com.learnJava.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Packmen implements GameConsole {
	public void up() {
		System.out.println("Pack up");
	}
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}

}
