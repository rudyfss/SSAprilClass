/*
 * In the package for day 5 assignments
 */
package com.ss.assignment.five;
import java.util.Scanner;

/*
 * The purpose of this class is to get input, first digit 
 * will be the number of data entries, second digit given will
 * be the operation type to perform, and the third type will be 
 * the data to perform that operation on
 */

public class Lambdas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many number of cases do you have?");
		int entries = input.nextInt();
		
		int[] operations = new int[entries];
		int[] numbers = new int[entries];
		
		
		
		System.out.println("Enter operation and data");
		for (int i=0; i < entries; i++) {
			operations[i] = input.nextInt();
			numbers[i] = input.nextInt();
		}
		
		for (int i=0; i < entries; i++) {
			System.out.println(operations[i] + " "+ numbers[i]);
			
		}
		
		PerformOperation oddCheck = (int a) -> {
			String answer = "";
			if (a%2 ==  0 ) {
				answer += "EVEN";
			}
			else {
				answer += "ODD";
			}
			
			return answer;
		};
		
		PerformOperation primeCheck = (int a) -> {
			for (int i=2; i <= a/2; i++) {
				if (a%i == 0) {
					return "COMPOSITE";
				}
			}
			return "PRIME";
		};
		
		PerformOperation palindromeCheck = (int a) -> {
			String process = String.valueOf(a);
			StringBuilder reversed = new StringBuilder();
			for (int i = process.length() -1; i > -1; i--) {
				reversed.append(process.charAt(i));
			}
			
			if (process.equals(reversed.toString())) {
				return "IT IS A PALINDROME";
			}
			
			return "NOT PALINDROME";
		};
		
		for (int i=0; i < entries; i++) {
			if (operations[i] == 1) {
				System.out.println( oddCheck.operation(numbers[i]));
			}
			
			if (operations[i] == 2) {
				System.out.println(primeCheck.operation(numbers[i]));
			}
			
			if (operations[i] == 3) {
				System.out.println(palindromeCheck.operation(numbers[i]));
			}
		}
		
	}

}
