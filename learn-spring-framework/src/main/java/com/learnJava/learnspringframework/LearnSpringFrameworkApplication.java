package com.learnJava.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learnJava.dummy.GameRunner;

@SpringBootApplication
@ComponentScan({"com.learnJava.learnspringframework","com.learnJava.dummy"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		
		//MarioGame game = new MarioGame();
		
		//SuperGame game = new SuperGame();
		
		//GameRunner runner = new GameRunner(game);
		
		runner.runGame();
	}

}
