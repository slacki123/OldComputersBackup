package TestForClassTest;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import main.Game;
import main.Player;

public class TestForClassTest {

	// Player name test

	@Test
	public void setPlayerNameTest() {
		Player player = new Player("John", "Starting Location");
		player.setPlayerName("Seb");
		assertEquals("The name doesn't match", "Seb", player.getPlayerName());
	}

	/////////////////////////////////////////////////////////
	// Set PlayerLocation Tests

	@Test
	public void setPlayerLocationTestNorth() {
		Player player = new Player("John", "Starting Location");
		player.setPlayerLocation("north");
		assertEquals("The location doesn't match", "North", player.getPlayerLocation());
	}

	@Test
	public void setPlayerLocationTestSouth() {
		Player player = new Player("John", "Starting Location");
		player.setPlayerLocation("2");
		assertEquals("The location doesn't match", "South", player.getPlayerLocation());
	}

	@Test
	public void setPlayerLocationTestEast() {
		Player player = new Player("John", "Starting Location");
		player.setPlayerLocation("east");
		assertEquals("The location doesn't match", "East", player.getPlayerLocation());
	}

	@Test
	public void setPlayerLocationTestWest() {
		Player player = new Player("John", "Starting Location");
		player.setPlayerLocation("4");
		assertEquals("The location doesn't match", "West", player.getPlayerLocation());
	}

	@Test
	public void setPlayerLocationTestBack() {
		Player player = new Player("John", "Starting Location");
		player.setPlayerLocation("back");
		assertEquals("The location doesn't match", "Castle", player.getPlayerLocation());
	}
	
	

	// End of set location Tests
	////////////////////////////////////////////////

	@Test
	public void testForGetWeather() {
		Player newPlayer = new Player("John", "North");
		assertEquals("Wrong weather", "cold and snowy", Location.getWeather(newPlayer));
	}
}
