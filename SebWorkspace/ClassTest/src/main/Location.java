package main;

public class Location {
		
	public static String getWeather(Player newPlayer) {
		if(newPlayer.getPlayerLocation().equals("North")) {
			return "cold and snowy";
		}
		else if (newPlayer.getPlayerLocation().equals("South")) {
			return "warm";		
		}
		else if (newPlayer.getPlayerLocation().equals("West") ) {
			return "rainy";
		}
		
		else if (newPlayer.getPlayerLocation().equals("East") ) {
			return "windy";
		}	
		else
		return "like a home should be";
		
	//Needs tests

}}
