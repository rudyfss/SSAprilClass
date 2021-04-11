package com.ss.assignment.four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUnitTest {
	Line lineOne = new Line(0.0,0.0,5.0, 5.0);
	Line lineTwo = new Line(1.0, 5.0, 2.0, 12.0);
	Line zeroSlope = new Line(0, 0, 0, 0);
	
	@Test
	public void getSlopeTest() {
		assertEquals(new Double(1.0), lineOne.getSlope(), 0.001);
		//zeroSlope.getSlope(); it does throw arithmetic exception
		
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(new Double(7.071), lineOne.getDistance(), 0.001);
	}
	
	@Test
	public void parallelTo() {
		
		assertFalse(lineOne.parallelTo(lineTwo));
	}
}
