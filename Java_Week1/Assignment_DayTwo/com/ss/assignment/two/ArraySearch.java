
/**
 * In a package that holds all of day two assignments
 */
package com.ss.assignment.two;

import java.util.Random;

/**
 * @author Rudyf
 *This class is meant to hold a 2d array and a method 
 *to check that 2d array to locate the maximum value
 */
public class ArraySearch {

	/**
	 * We will create an array in main method and 
	 * call findMax method to return a string that 
	 * shows us where the max value in the 2d array is
	 * and what that value is
	 */
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		Random randomNumber = new Random();
		
		for (int i=0; i < array.length; i++) {
			for (int j=0; j < array[i].length; j++) {
				array[i][j] = randomNumber.nextInt(500);
			}
		}
		
		for (int i=0; i < array.length; i++) {
			for (int j=0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " "); 
			}
			System.out.println();
		}
		System.out.println(findMax(array));
	}
	
	
	//findMax searches the array, saves the max, max row index, 
	//and max column index and returns that info as a string
	private static String findMax(int[][] arrayToProcess) {
		StringBuilder maxInfo = new StringBuilder();
		int max = 0, rowIndex = 0, colIndex = 0; 
		
		for (int i=0; i < arrayToProcess.length; i++) {
			for (int j=0; j < arrayToProcess[i].length; j++) {
				if (arrayToProcess[i][j] > max) {
					max = arrayToProcess[i][j];
					rowIndex = i;
					colIndex = j;
				}
			}
		}
		maxInfo.append("Max Value: " + max + "\nRow Index: " 
				+rowIndex+"\nColumn Index: "+colIndex);
		String output = maxInfo.toString();
		return output;
	}

}
