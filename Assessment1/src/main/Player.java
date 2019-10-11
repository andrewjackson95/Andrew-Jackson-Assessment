package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {

	int mapEndPositionX = 5;
	int mapEndPositionY = 5;
	int playerPositionX = 0;
	int playerPositionY = 0;
	boolean endGame = false;
	int mapTreasurePosition1X = 3;
	int mapTreasurePosition1Y = 3;
	int mapTreasurePosition2X = 6;
	int mapTreasurePosition2Y = 1;
	Random findMe = new Random();

	public Player() {

		System.out.println("");
		System.out.println("As the icy fog draws nearer, shimmering in the full moon, you realise you need ");
		System.out.println("to escape the ruins. You stumble around looking for a way out when you trip ");
		System.out.println("on the skeletons of the previous player. Your leg snaps resulting in you ");
		System.out.println("barely being able to walk, aside from one step a turn. Fortunately, whilst you ");
		System.out.println("were on the floor you found a compass which could help you find your way out. ");
		System.out.println("");
		System.out.println("Enter movement direction (north, south, east, west): ");
		System.out.println("");
	}

	public void game(boolean endGame) {
		Scanner input = new Scanner(System.in);
		System.out.println("");
		String userDirection1 = input.nextLine();
		if (userDirection1.equals("north")) {
			playerPositionY = playerPositionY + 1;
			System.out.println("New position Y: " + playerPositionY + " Position X: " + playerPositionX);
		} else if (userDirection1.equals("south")) {
			playerPositionY = playerPositionY - 1;
			System.out.println("New position Y: " + playerPositionY + " Position X: " + playerPositionX);
		} else if (userDirection1.equals("east")) {
			playerPositionX = playerPositionX + 1;
			System.out.println("New position Y: " + playerPositionY + " Position X: " + playerPositionX);
		} else if (userDirection1.equals("west")) {
			playerPositionX = playerPositionX - 1;
			System.out.println("New position Y: " + playerPositionY + " Position X:" + playerPositionX);
		} else {
			System.out.println("Please enter a valid direction");
		}

		int distanceFromTreasureX = (mapEndPositionX - playerPositionX);
		System.out.println("Distance from treasure X: " + distanceFromTreasureX + "m");

		int distanceFromTreasureY = (mapEndPositionY - playerPositionY);
		System.out.println("Distance from treasure Y: " + distanceFromTreasureY + "m");

		double compass = Math.hypot(distanceFromTreasureX, distanceFromTreasureY);
		System.out.println("Compass distance from treasure:  " + compass + "m");

		if (playerPositionX == mapEndPositionX && playerPositionY == mapEndPositionY) {
			System.out.println("");
			System.out.println("-----------------------------------------");
			System.out.println("-------------Congratulations-------------");
			System.out.println("-You have successfully excaped the ruins-");
			System.out.println("-----------------------------------------");
			input.close();
		}
		
		if (playerPositionX == mapTreasurePosition1X && playerPositionY == mapTreasurePosition1Y) {
			System.out.println("");
			System.out.println("You found a funny looking boulder");
		}
		
		int distanceFromTreasure1 = (mapTreasurePosition1X - playerPositionX);
		int distanceFromTreasure2 = (mapTreasurePosition1Y - playerPositionY);
		double compass2 = Math.hypot(distanceFromTreasure1, distanceFromTreasure2);
		
		if (compass2 <= 3) {
			System.out.println("");
			System.out.println("A myster treasure is nearby");
		}
		
		
		/*
		 * if (playerPositionX == findMe.nextInt(3) && playerPositionY ==
		 * findMe.nextInt(3) { System.out.println("");
		 * System.out.println("You bump into a log, but continue on the journey"); }
		 */
	}
}