package com.learnJava.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learnJava.learnspringframework.GameConsole;
@Component
public class GameRunner {
	
	
	private GameConsole game;

//	public GameRunner(GameConsole game) {
//		// TODO Auto-generated constructor stub
//		System.out.println("using constructer");
//		this.game=game;
//	}
	@Autowired
//	public void setGame(GameConsole game) {
//		System.out.println("using setter");
//		this.game=game;
//	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
