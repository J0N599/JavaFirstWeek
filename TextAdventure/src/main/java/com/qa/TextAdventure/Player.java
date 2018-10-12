package com.qa.TextAdventure;

public class Player {

	Position adventurer = new Position(0, 0);
	Position treasure = new Position(2, 5);

	public void movement(String playerInput) {
		switch (playerInput) {
		case "North":
		case "north":
		case "N":
		case "n":
			adventurer.sety(adventurer.gety() + 1);
			System.out.print("Your current position is: ");
			System.out.print(adventurer.getx() + " ");
			System.out.println(adventurer.gety());
			break;
		case "South":
		case "south":
		case "S":
		case "s":
			adventurer.sety(adventurer.gety() - 1);
			System.out.print("Your current position is: ");
			System.out.print(adventurer.getx() + " ");
			System.out.println(adventurer.gety());
			break;
		case "East":
		case "east":
		case "E":
		case "e":
			adventurer.setx(adventurer.getx() + 1);
			System.out.print("Your current position is: ");
			System.out.print(adventurer.getx() + " ");
			System.out.println(adventurer.gety());
			break;
		case "West":
		case "west":
		case "W":
		case "w":
			adventurer.setx(adventurer.getx() - 1);
			System.out.print("Your current position is: ");
			System.out.print(adventurer.getx() + " ");
			System.out.println(adventurer.gety());
			break;
		}
	}

}
