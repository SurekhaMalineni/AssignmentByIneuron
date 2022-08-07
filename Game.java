package corejava;

import java.util.Scanner;

class Guesser {

	int guessnum;

	int guessernum() {

		Scanner sc = new Scanner(System.in);
		System.out.print("guesser, please guess a number inbetween 1 to 9 ");

		guessnum = sc.nextInt();

		if (guessnum < 1 || guessnum > 9) {

			System.out.println("enter valid number");
			guessernum();

		} else {

			System.out.println("game will continue");
		}

		return guessnum;

	}

}

class Player {

	int playernum;

	int[] players() {

		System.out.print("enter number of players  ");
		Scanner sc = new Scanner(System.in);
		int totalplayers = sc.nextInt();
		int tpvalues[] = new int[totalplayers];

		for (int i = 0; i < tpvalues.length; i++) {

			System.out.println("player " + i + " please guess a number");
			tpvalues[i] = sc.nextInt();

			if (tpvalues[i] < 0 || tpvalues[i] >= 9) {

				System.out.println("pls enter valid number");
				i = i - 1;

			}

		}

		return tpvalues;
	}

}

class Umpire {

	void ustore() {

		Guesser g = new Guesser();
		int guessernum = g.guessernum();

		Player p1 = new Player();
		int[] tpvalues = p1.players(); // players numbers
		
		int count=0;
		
		for (int i = 0; i < tpvalues.length; i++) {

			
			if (guessernum == tpvalues[i]) {
				
				count++;
				System.out.println("player" + "	" + i + " " + "won the game");

			}
					

		}
		if(count==0) {
			System.out.println("nobody win the game,please try again!!!");
		}

		
	}

}

public class Game {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.ustore();

	}

}
