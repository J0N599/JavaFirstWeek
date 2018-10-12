package com.qa.TextAdventure;

public class AdventureRunner {

	static Player player = new Player();

	static WhileScan treasureCheck = new WhileScan();

	public static void main(String[] args) {
		System.out.println("Input direction to move:");
		player.movement("e");
		System.out.println("Input direction to move:");

	}

}