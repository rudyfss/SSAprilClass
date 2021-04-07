/**
 * Package that holds all of the day 2 assignments
 */
package com.ss.assignment.two;

/**
 * @author Rudyf
 *This class is meant to add input we get from the command line 
 *arguments
 */
public class AddingInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		StringBuilder userInput = new StringBuilder();
		 for (String commandLineArgs : args) {
			 try {
			 userInput.append(commandLineArgs + " + ");
			 int number = Integer.parseInt(commandLineArgs);
			 sum = sum + number;
			 }
			 catch (Exception error){
				 
			 }
			 
		 }
		 System.out.print(userInput + "= " + sum);
	}

}
