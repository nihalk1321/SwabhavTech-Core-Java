package com.monocept.test;

import java.util.Random;
import java.util.Scanner;

public class PigDice {
	public static void main(String[] args) {
		displayrulesOfPigGame();
		int maxScore = 20;
		int totalScore = 0;
		int turnscore = 0;
		playGame(maxScore, totalScore, turnscore);
	}

	private static void playGame(int maxScore, int totalScore, int turnscore) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (turnscore < maxScore) {
			System.out.println(" Roll or Hold? (r/h) ");
			if (totalScore + turnscore < maxScore) {
				int rolled = random.nextInt(6) + 1;
				System.out.println(" Die " + rolled);
				if (rolled == 1) {
					System.out.printf(" Turn Over.No Score");
					return;
				} else {
					turnscore += rolled;
					continue;
				}
			} else {
				totalScore += turnscore;
				if (totalScore >= maxScore)
					break;
				System.out.println(" Sticking with " + totalScore);
			}
			turnscore = 0;
		}
		System.out.println("Score for turn" + totalScore);
	}

	private static void displayrulesOfPigGame() {
		System.out.println("Let's Play PIG!\r\n" + "\r\n" + "* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn.");
	}
}
