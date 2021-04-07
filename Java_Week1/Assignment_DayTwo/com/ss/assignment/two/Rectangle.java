/**
 * Package that holds all of the day 2 assignments
 */
package com.ss.assignment.two;

/**
 * @author Rudyf
 *Here we create a rectangle class that implements shape, we give it 
 *3 instance variables length, width, and area, and have methods to 
 *manipulate those 3 instance variables and return it to the user
 */
public class Rectangle implements Shape {
	
	private int length;
	private int width;
	private int area;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		this.area = 0;
	}
	
	public Rectangle() {
		length = 0;
		width = 0;
		area = 0;
	}
	
	public void calculateArea() {
		area = length * width;
	}

	public String display() {
		StringBuilder output = new StringBuilder();
		output.append("Length: "+length+"\nWidth: "+width
			+"\nArea: "+area);
		return output.toString();
	}

}
