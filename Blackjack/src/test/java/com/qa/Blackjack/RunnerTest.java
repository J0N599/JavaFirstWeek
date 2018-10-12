package com.qa.Blackjack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RunnerTest {

	// @Test
	//
	// public void failTest() {
	//
	// fail("Not yet implimented");
	//
	// }

	@Test

	public void BlackJackTest() {

		BlackJack blackjack = new BlackJack();

		assertTrue(blackjack instanceof BlackJack);

	}

	@Test

	public void generalTest() {

		BlackJack blackjack = new BlackJack();

		assertEquals(20, blackjack.play(20, 19));
		assertEquals(18, blackjack.play(16, 18));
		assertEquals(20, blackjack.play(15, 20));
		assertEquals(19, blackjack.play(19, 17));

	}

	@Test

	public void maxErrors() {

		BlackJack blackjack = new BlackJack();

		assertEquals(10, blackjack.play(10, 22));
		assertEquals(21, blackjack.play(22, 21));
		assertEquals(21, blackjack.play(22, 21));
		assertEquals(0, blackjack.play(22, 22));

	}

	@Test

	public void tieTest() {

		BlackJack blackjack = new BlackJack();

		assertEquals(777, blackjack.play(21, 21));
		assertEquals(777, blackjack.play(18, 18));
		assertEquals(777, blackjack.play(19, 19));

	}

	@Test

	public void zeroTest() {

		BlackJack blackjack = new BlackJack();

		assertEquals(0, blackjack.play(0, 0));
		assertEquals(0, blackjack.play(0, 3));
		assertEquals(0, blackjack.play(21, 0));

	}
}
