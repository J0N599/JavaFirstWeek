package com.qa.Blackjack;

public class BlackJack {

	public int play(int player1, int player2) {
		if (player1 == 0 || player2 == 0) {
			return 0;
		}
		if (player1 > 21 && player2 > 21) {
			return 0;
		}
		if (player1 == player2) {
			return 777;
		}
		if (player1 < 22 && player2 > 21) {
			return player1;
		}
		if (player2 < 22 && player1 > 21) {
			return player2;
		}
		if (player1 > player2 && player1 < 22 && player1 > 0) {
			return player1;
		}
		if (player2 > player1 && player2 < 22 && player2 > 0) {
			return player2;
		} else {
			return 101;
		}
	}
}