
/**
 * In the package for day four assignments
 */
package com.ss.assignment.four;

/**
 * @author Rudyf
 *this is a line class to see different information abobut lines
 */
public class Line {
	private double x0, y0, x1, y1;
	
	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	//calculate slope of line
	public double getSlope() {
		if(x1 == x0) {
			throw new ArithmeticException();
		}
		
		return (y1-y0)/(x1-x0);
	}
	
	//calculate the distance of the line 
	public double getDistance() {
		return Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
	}
	
	//returns whether a line is parallel to another
	public boolean parallelTo(Line One) {
		if(Math.abs(getSlope() - One.getSlope()) < 0.0001 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
