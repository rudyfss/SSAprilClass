
/**
 * Inside the package for day three assignments
 */
package com.ss.assignment.three;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Rudyf
 *This class is meant to get a path and show the path
 *info such as sub directories and files
 */
public class PathInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("We would like to see the info of textFiles directory");
		
		File folder = new File ("textFiles");
		File[] folderContents = folder.listFiles();
		
		for (File content : folderContents) {
			if (content.isFile()) {
			System.out.println("     " +content.getName());
			}
			else {
				System.out.println(content.getName());
			}
		}
		
	}

}
