package guessingTest;

import static org.junit.Assert.*;

import org.junit.Test;

import guessing.Game;

public class GuessingGameTest {
	
	@Test
	public void generateNumber() {
		Game game = new Game();
		
		assertNotEquals("Same as guess, 5% chance", 0, game.generateNumber());
	}
	
	@Test
	public void humanGuess() {
		Game game = new Game();
		game.setCorrectNumber(5);
		assertEquals("Wrong method", "Spot on!", game.humanGuess(5));
	}
	
	@Test
	public void humanGuess2() {
		Game game = new Game();
		game.setCorrectNumber(5);
		assertEquals("Wrong method", "lower", game.humanGuess(6));
	}
	
	@Test
	public void humanGuess3() {
		Game game = new Game();
		game.setCorrectNumber(5);
		assertEquals("Wrong method", "higher", game.humanGuess(4));
	}

}
