package com.qa.Blackjack;

public class Runner {

	public static void main(String[] args) {

		BlackJack blackjack = new BlackJack();

		System.out.println(blackjack.play(10, 22));

		System.out.println(blackjack.play(14, 20));
	}

}
