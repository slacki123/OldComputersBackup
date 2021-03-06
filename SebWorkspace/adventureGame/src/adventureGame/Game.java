package adventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	ArrayList<MapObjects> objectList = new ArrayList<MapObjects>();
	Player seb = new Player("Seb");

	public void loadObjects() {

		MapObjects sword = new MapObjects("Sword");
		MapObjects rock = new MapObjects("Rock");

		objectList.add(sword);

	}

	public void newGame(Player player) {

		loadObjects();

		intro();

		playerMoveLoop(player);

	}

	public void intro() {
		System.out.println(
				"Welcome, adventurer! You have found yourself within a castle where there's nothing to do. Go out for a walk.");
		System.out.println("Where would you like to move? \nType in either " + "'north', 'south', 'west', 'east'");
		System.out.println("\nAt any point in the game you can type in 'action' to do other things than walking\n");

	}

	public void checkObjectProximity(Player player) {
//		if (objectList.size() > 0) {
			for (int i = 0; i<objectList.size();i++) {
				
				if (player.getDistanceToObject(objectList.get(i)) == 0) {
					//Optional - add an if statement and a scanner to type in whether you want to pick up the object or not
					player.playerPickUpObject(objectList.get(i));
					objectList.remove(objectList.get(i));
//				}

			}
		}
	}

	public void playerMoveLoop(Player player) {
		boolean temp = true;
		while (temp) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("> ");
			String input = sc.nextLine().toLowerCase();
			if (input.equals("action")) {
				System.out.println(
						"Type in 'inventory' to check inventory \nor type in 'position' to obtain your coordinates");
				System.out.print("> ");
				String input1 = sc.nextLine().toLowerCase();
				player.playerTakeAction(input1);
			}
			player.playerMove(input);
			checkObjectProximity(player);
			// System.out.println("You are " + String.format("%.1f",
			// player.getStartingDistance())
			// + "m away from the castle, keep walking or type 'action'");
			if (player.getStartingDistance() > 3 && player.getStartingDistance() <= 5) {
				System.out.println("You're too far from the castle! Go back or the wolves will eat you.");
				playerMoveLoop(player);
			} else if (player.getStartingDistance() > 4) {
				temp = false;
				System.out.println("The wolves have eaten you. You are dead. Type in anything to start again.");
				System.out.print("> ");
				sc.nextLine();
				objectList.clear();
				player.clearInventory();
				player.setPlayerCoordinates(0, 0);
				newGame(player);
			}

		}
	}

}