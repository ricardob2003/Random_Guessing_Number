//Ricardo Barahona
//I exceeded the requiremenst of the assignment by integrating an ArrayList that prints all the Random Values of each round
// I also included a how many correct and incorrect guesses of each user. 

package RandomNumberGuess;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		String play;
		int correctGuess = 0;
		int wrongGuess = 0;
		ArrayList randomValue = new ArrayList();
		int correctScore = 0;
		int incorrectScore = 0;

		do {
			Random rand = new Random();
			Scanner scanner = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);
			int randomNumber = rand.nextInt(100) + 1;

			randomValue.add(randomNumber);
			int tryCount = 0;
			System.out.println("Welcome to the Number Guessing Game.\n"
					+ "If you want to win, you must guess the random number in only 5 attempts\n");

			do {
				System.out.println("Enter your guess (1-100):");

				int playerGuess = scanner.nextInt();
				tryCount++;

				if (playerGuess == randomNumber) {
					System.out.println("Correct! You Win!");
					System.out.println("It took you " + tryCount + " tries");
					correctGuess++;
					correctScore++;
					break;
				} else if (randomNumber > playerGuess) {
					System.out.println("Nope! The number is higher. Guess again.");
					wrongGuess++;
				} else {
					System.out.println("Nope! The number is lower. Guess again.");
					wrongGuess++;
				}
				if(playerGuess != randomNumber && tryCount == 5) {
					System.out.println("You have exceeded the amount of attempts allowed");
					incorrectScore++;
				}
			} while (tryCount < 5);
				

			System.out.println("\nWould you like to play again? (y/n)");
			play = scan.nextLine();
		} while (play.charAt(0) == 'y');

		System.out.println("\nYou selected 'n'\n" + "The ammount of correct guesses you had were: " + correctGuess
				+ "\nThe number of incorrect guesses you had were: " + wrongGuess);
		System.out.println("The number of rounds you won were: " + correctScore);
		System.out.println("The number of rounds you lost were: " + incorrectScore);
		System.out.println("The Random Numbers in each round played were:" + randomValue);

	}

}
