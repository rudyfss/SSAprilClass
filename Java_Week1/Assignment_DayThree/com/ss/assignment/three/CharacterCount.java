
/**
 * Inside the package for day 3 assignments
 */
package com.ss.assignment.three;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Rudyf
 * This class just takes a command line argument, searches a file
 * for the character specified in the command line, and tells us
 * how many times that character occurred in the file.
 */
public class CharacterCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		char search = args[0].charAt(0);
		
		System.out.println("Character to search for: " + search);
		
		try (BufferedReader file = new BufferedReader(new FileReader("textFiles/randomCharacters"))){
			int check = 0;
			while ((check = file.read()) != -1) {
				if ((char)check == search) {
					count ++;
				}
				System.out.print((char)check + " | ");
			}
			
		}
		catch (Exception error){
			System.out.println(error.getMessage());
		}
		System.out.println();
		System.out.println("Number of times character appears: " + count);
	}

}
