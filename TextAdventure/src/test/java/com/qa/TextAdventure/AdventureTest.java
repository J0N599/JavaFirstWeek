package com.qa.TextAdventure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdventureTest {

	static Position adventurer = new Position(0, 0);

	public static Position movement(String direction) {

		if (direction.equals("north")) {
			adventurer.sety(1);
		}
		if (direction.equals("south")) {
			adventurer.sety(-1);
		}
		if (direction.equals("east")) {
			adventurer.setx(1);
		}
		if (direction.equals("west")) {
			adventurer.setx(-1);
		} else {
			return adventurer;
		}

		return adventurer;
	}

	@Test

	public void positionTest() {

		assertEquals(1, movement("north").y);

	}
}
