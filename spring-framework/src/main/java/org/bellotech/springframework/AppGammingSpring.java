package org.bellotech.springframework;

import org.bellotech.springframework.game.GameRunner;
import org.bellotech.springframework.game.MarioGame;
import org.bellotech.springframework.game.PacManGame;
import org.bellotech.springframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGammingSpring {

	public static void main(String[] args) {
//launch spring context

		var context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
		// configure spring manage--@Configuration

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("Address"));
		
	}

}
