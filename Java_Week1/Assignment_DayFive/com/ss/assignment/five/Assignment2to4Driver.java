
/**
 * In the package for day 5 assignments
 */
package com.ss.assignment.five;

/**
 * @author Rudyf
 * This is meant to serve as a driver to run 
 * all of the lambda expressions for problems 
 * 2 to 4
 */
public class Assignment2to4Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PerformOperationTwo getRightDigits = (int[] array) -> {
			
			int[] right = new int[array.length];
			for (int i=0; i < array.length;i++) {
				right[i] = array[i] % 10;
			}
			
			return right;
		};
		
		int[] testArray = new int[]{16,8,886,8,1};
		
		int[] rightDigits = getRightDigits.rightDigit(testArray);
		
		for (int i=0; i < rightDigits.length; i++) {
			System.out.print(rightDigits[i] + " ");
		}
		
		PerformOperationThree doubleTheseNumbers = (int[] array) -> {
			int[] doubled = new int[array.length];
			
			for (int i=0; i < array.length; i++) {
				doubled[i] = array[i] * 2;
			}
			
			return doubled;
		};
		System.out.println();
		
		int[] testDoubled = new int[] {6,8,6,8,-1};
		int[] doubledArray = doubleTheseNumbers.doubleNumbers(testDoubled);
		
		System.out.println("Doubled array: ");
		for (int i=0; i < rightDigits.length; i++) {
			System.out.print(doubledArray[i] + " ");
		}
		
		PerformOperationFour removeX = (String[] array) -> {
			String[] noXArray = new String[array.length];
			
			for (int i=0; i < array.length; i++) {
				noXArray[i] = array[i].replaceAll("x", "");
			}
			
			return noXArray;
		};
		System.out.println();
		
		String[] xArray = new String[] {"xxax", "xbxbx", "xxcx"};
		String[] noXArray = removeX.noX(xArray);
		
		
		System.out.println("No X Array: ");
		for (int i =0; i < noXArray.length; i++) {
			System.out.print(noXArray[i] + " ");
		}
		
	}

}
