package com.bridgelabz.functional;
import java.util.logging.Logger;

import com.bridgelabz.Utility.Util;

public class Tictactoe {

	static final int EMPTY = 0;
	static final int NONE = 0;
	static final int USER = 1;
	static final int COMPUTER = 2;
	static final int STALEMATE = 3;

	public static void main(String[] args) {
		Util util=new Util();
		int turn = USER;
		int[][] board = new int[3][3];

		int move;

		while (true) {
			if (turn == USER) {
				Logger.getLogger("Your move");
				move = -1;
				while (move < 0 || move > 9 || board[move / 3][move % 3] != EMPTY) {
					
					Logger.getLogger("Please enter your move(0-9): ");
					move = util.Scanner1();
					util.Scanner6();
				}
			} else {
				move = computermove(board);
				Logger.getLogger("Computer move: " + move);
			}
			board[(int) (move / 3)][move % 3] = turn;
			printboard(board);

			if (turn == USER) {
				turn = COMPUTER;
			} else {
				turn = USER;
			}

		}
	}

	public static void printboard(int[][] board) {
		System.out.println(printChar(board[0][0]));
		Logger.getLogger("|");
		System.out.print(printChar(board[0][1]));
		Logger.getLogger("|");
		System.out.println(printChar(board[0][2]));
		Logger.getLogger("-----");
		System.out.print(printChar(board[1][0]));
		Logger.getLogger("|");
		System.out.print(printChar(board[1][1]));
		Logger.getLogger("|");
		System.out.println(printChar(board[1][2]));
		Logger.getLogger("-----");
		System.out.print(printChar(board[2][0]));
		Logger.getLogger("|");
		System.out.println(printChar(board[2][1]));
		Logger.getLogger("|");
		System.out.println(printChar(board[2][2]));
	}

	public static char printChar(int b) {
		switch (b) {
		case EMPTY:
			return ' ';
		case USER:
			return 'X';
		case COMPUTER:
			return 'O';
		default:
			return ' ';
		}
	}

	public static int computermove(int[][] board) {

		int move = ((int) Math.random() * 9);

		while (board[move / 3][move % 3] != EMPTY)
			move = ((int) Math.random() * 9);

		return move;
	}
}
