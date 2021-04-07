/**
 * Package that holds all of the day 2 assignments
 */
package com.ss.assignment.two;

/**
 * @author Rudyf
 *Here we have a simple triangle class that implements shape 
 *and holds three instance variables, base, height, and area. 
 *We also have the necessary methods to calculate area and 
 *display that information back to the user.
 */
public class Triangle implements Shape {
	private double base;
	private double height;
	private double area;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		this.area = 0;	
	}
	
	public Triangle() {
		this.base = 0;
		this.height = 0;
		this.area = 0;	
	}
	
	public void calculateArea() {
		area = (base * height) / 2;
	}
	
	public String display() {
		StringBuilder output = new StringBuilder();
		output.append("Base: "+base+"\nHeight: "+height
			+"\nArea: "+ area);
		return output.toString();
	}
}
