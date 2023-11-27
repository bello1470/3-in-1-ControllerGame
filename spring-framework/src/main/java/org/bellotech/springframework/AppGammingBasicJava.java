package org.bellotech.springframework;

import org.bellotech.springframework.game.GameRunner;
import org.bellotech.springframework.game.MarioGame;
import org.bellotech.springframework.game.PacManGame;
import org.bellotech.springframework.game.SuperContraGame;

public class AppGammingBasicJava {

	public static void main(String[] args) {
	//	var game = new MarioGame();
		var game = new PacManGame();
	//	var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		//var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
