/**
 * Package that holds all of the day 2 assignments
 */
package com.ss.assignment.two;

/**
 * @author Rudyf
 *This class is the driver class meant to create shape objects 
 *and showing all of the different classes' and their functionality
 */
public class ShapesDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//HERE WE WILL BE SHOWING OFF EACH SHAPE CLASS

		Shape circle = new Circle(15);
		circle.calculateArea();
		System.out.println("CIRCLE: ");
		System.out.println(circle.display());
		
		Shape rectangle = new Rectangle(5, 10);
		rectangle.calculateArea();
		System.out.println("RECTANGLE: ");
		System.out.println(rectangle.display());
		
		Shape triangle = new Triangle(7, 5);
		triangle.calculateArea();
		System.out.println("TRIANGLE: ");
		System.out.println(triangle.display());
		
	}

}
