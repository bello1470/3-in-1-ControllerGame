package org.bellotech.springframework.game;

public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("down ");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Go left");
	}
}
