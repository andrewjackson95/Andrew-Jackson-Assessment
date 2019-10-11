package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Player p = new Player();
		
		boolean endGame = true;
		
		do{
		p.game(endGame);
		} while (endGame);

	}
}