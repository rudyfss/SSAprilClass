/**
 * Package that holds all of the day 2 assignments
 */
package com.ss.assignment.two;

/**
 * @author Rudyf
 *Here we have a class for circle that implements shape 
 *and has two instance variables, radius and area. We have
 *the necessary methods to calculate the area and return that 
 *information to the user
 */
public class Circle implements Shape{
	private int radius;
	private double area;
	
	public Circle(int radius) {
		this.radius = radius;
		this.area = 0;
	}
	
	public Circle() {
		this.radius = 0;
		this.area = 0;
	}
	
	public void calculateArea() {
		this.area = radius * radius * 3.1415;
	}
	
	public String display() {
		StringBuilder output = new StringBuilder();
		output.append("Radius: "+radius+
			"\nArea: "+area);
		return output.toString();
	}
}
