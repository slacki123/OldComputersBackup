package main;

import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner(System.in);

	// Player newPlayer = new Player("John", "Starting Location");

	public static void startNewGame(Player newPlayer) {

		Game.setPlayerName(newPlayer);

		setPlayerLocation(newPlayer); // code reuse

	}

	private static void setPlayerName(Player newPlayer) {

		String name;
		System.out.println("Please type your name below:");
		name = sc.nextLine();

		newPlayer.setPlayerName(name);
		System.out.println("Welcome " + newPlayer.getPlayerName()
				+ "\n You live in a castle, cause why not? You have decided to go either north, south, west or east just to check what the weather there is like. \n");
		System.out.println(
				"You are at the castle, where would you like to go?\n 1. North \n 2. South \n 3. East \n 4. West \nPlease type the direction or value below:");

	}

	public static void setPlayerLocation(Player newPlayer) {

		String locationChoice;
		locationChoice = sc.nextLine().toLowerCase();

		newPlayer.setPlayerLocation(locationChoice);

		System.out.println(
				"So " + newPlayer.getPlayerName() + ", you decide to go " + newPlayer.getPlayerLocation() + "...");
		System.out.println("\n The weather here is " + Location.getWeather(newPlayer));

		System.out.println("Type in 'back' to go back");
		locationChoice = sc.nextLine().toLowerCase();
		newPlayer.setPlayerLocation(locationChoice);

		System.out.println("You decided to go back");
		System.out.println(
				"You are at the castle, where would you like to go?\n 1. North \n 2. South \n 3. East \n 4. West \nPlease type below:");
		setPlayerLocation(newPlayer); //code reuse and loop

	}

}
