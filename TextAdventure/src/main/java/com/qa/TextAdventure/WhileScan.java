package com.qa.TextAdventure;

import java.util.Scanner;

public class WhileScan {

	static Player player = new Player();

	public static String treasureCheck() {
		while (player.adventurer.getx() != player.treasure.getx()
				&& player.adventurer.gety() != player.treasure.gety()) {
			String playerInput = new Scanner(System.in).next();
			return playerInput;
		}
		return null;
	}
}
