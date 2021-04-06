/**
 * 
 */
package com.ss.assignment.one;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Rudyf
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(1001) + 1;
		
		int lowerLimit = number - 10;
		int upperLimit = number + 10;
		int numberOfGuesses = 0;
		boolean withInRange = false;
		
		while (numberOfGuesses < 5 ) {
			System.out.println("I'm thinking of a number. It's between "
			+ "1 and 1000, can you guess it?");
			
			int guess = input.nextInt();
			if (guess >= lowerLimit && guess <= upperLimit) {
				System.out.print("Close enough, the number was "
				+number);
				input.close();
				break;
			}
			
			numberOfGuesses ++;
		}
		input.close();
		if (numberOfGuesses >= 4) {
			System.out.println("Sorry, you didn't guess the number."
			+" It was "+number);
		}
	}

}
