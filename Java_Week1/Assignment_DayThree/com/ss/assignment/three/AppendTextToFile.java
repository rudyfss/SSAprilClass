/**
 * In the package for the day 3 assignments
 */
package com.ss.assignment.three;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * @author Rudyf
 *Here we will have a class that will ask the user for their
 * name and current favorite song, write their name and 
 * favorite color into a file, and show that file to the 
 * user 
 */
public class AppendTextToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//GET INFO FROM 
		System.out.println("What's your name?");
		String name = input.nextLine();
		System.out.println("What's your favorite song right now?");
		String favoriteSong = input.nextLine();
		input.close();
		String info = name + " --  " + favoriteSong;
		
		//WRITE INPUT TO FILE
		try {
			Files.write(Paths.get("textFiles/favoritesongs.txt"), info.getBytes());
		}
		
		catch(Exception error) {
			System.out.println(error.getMessage());
		}
		
		//READ FILE
		try (BufferedReader file = new BufferedReader(new FileReader("textFiles/favoritesongs.txt"))){
			String line;
			while ((line = file.readLine()) != null)
			System.out.println(line);
		}
		
		catch (Exception error){
			System.out.println(error.getMessage());
		}
	}

}