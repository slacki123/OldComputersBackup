package guessing;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
	Random rand = new Random();
	private int computercorrectNumber;
	private int humanCorrectNumber;
	private int computerInitialGuess = rand.nextInt(15);

	Scanner sc = new Scanner(System.in);

	boolean temp = true;

	public void setHumanCorrectNumber(int input) {
		this.humanCorrectNumber = input;
	}

	public int getCorrectNumber() {
		return computercorrectNumber;
	}

	public void setCorrectNumber(int correctNumber) {
		this.computercorrectNumber = correctNumber;
	}

	public int generateNumber() {
		computercorrectNumber = rand.nextInt(Integer.MAX_VALUE);
		return computercorrectNumber;
	}

	public void computerGuess() {
		int difference = computerInitialGuess - humanCorrectNumber;

		if (difference < 0) {
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				computerInitialGuess = computerInitialGuess + 1;
				System.out.println("Computer guess: " + computerInitialGuess);
				if (difference == 0) {
					temp = false;
				}
			}
			computerInitialGuess = computerInitialGuess + 10;

		} else if (difference > 0) {
			
				computerInitialGuess = computerInitialGuess - 1;
				System.out.println("Computer guess: " + computerInitialGuess);
			
	
		} else 
		
		{
			temp = false;}
		}
	

	public String humanGuess(int guess) {

		int difference = guess - computercorrectNumber;

		if (difference < 0) {
			return "higher";
		}

		else if (difference > 0) {
			return "lower";
		}

		else {
			temp = false;
			return "Spot on!";

		}

	}

	public void loop() {
		while (temp) {

			try {
				int input = 0;
				System.out.print(">");
				try {
					input = sc.nextInt();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Must be an integer!");
					temp = false;
				}
				System.out.println(humanGuess(input));
			} catch (Exception e) {
				e.printStackTrace();
				temp = false;
				computerVsHuman();
			}

		}
	}

	public void humanVsComputer() {
		System.out.println("Guess a number!");
		generateNumber();
		loop();

	}

	public void computerVsHuman() {
		int input1;
		System.out.println("Please choose a number for the computer to guess");
		System.out.print(">");
		input1 = sc.nextInt();
		setHumanCorrectNumber(input1);
		while (temp) {
			computerGuess();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
