
/**
 * Inside the package for all of the day four assignments
 */
package com.ss.assignment.four;

/**
 * @author Rudyf
 *the purpose of this class is to 
 */
public class Deadlock {
	public static void main(String[] args) {
		final Integer numOne = new Integer(5);
		final Integer numTwo = new Integer(10);
		
		System.out.println("This program will not stop running");
		
		Runnable firstThread = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (numOne) {
						Thread.sleep(500);
						synchronized (numTwo) {
							
						}
					}
				}
				catch(Exception error) {
					System.out.println(error.getMessage());
				}
			}
			
		};
		
		Runnable secondThread = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (numTwo) {
						Thread.sleep(500);
						synchronized (numOne) {
							
						}
					}
				}
				catch(Exception error) {
					System.out.println(error.getMessage());
				}
			}
			
		};
		
		new Thread(firstThread).start();
		new Thread(secondThread).start();
	}
}
