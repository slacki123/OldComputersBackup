package main;

import java.util.Scanner;

public class Player {
	
	private String playerName;
	private String playerLocation;
	
	public Player(String playerName, String playerLocation) {
		this.playerName = playerName;
		this.playerLocation = playerLocation;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerLocation() {	
		return playerLocation;
	}
	
	
	public void setPlayerLocation(String playerLocation) {
		if(playerLocation.equals("1") || playerLocation.equals("north")) {
			this.playerLocation = "North";
		}
		else if (playerLocation.equals("2") || playerLocation.equals("south")) {
			this.playerLocation = "South";
		}
		else if (playerLocation.equals("3") || playerLocation.equals("east")) {
			this.playerLocation = "East";
		}
		else if (playerLocation.equals("4") || playerLocation.equals("west")) {
			this.playerLocation = "West";
		}
		else if(playerLocation.equals("back")) {
			this.playerLocation = "Castle";
		}
		else {
			System.out.println("Sorry, you have to enter a valid value");
		}
		
		
	}
	
	
	

}
