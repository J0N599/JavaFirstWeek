package com.qa.TextAdventure;

import java.util.Scanner;

public class WhileScan {

	static Player player = new Player();
	static Scanner scanner = new Scanner(System.in);

	public String treasureCheck() {
		String playerInput = scanner.next();
		while (player.adventurer.getx() != player.treasure.getx()
				&& player.adventurer.gety() != player.treasure.gety()) {
			playerInput = scanner.next();
			return playerInput;
		}
		return playerInput;
	}
}
