/*
 * 
 */
package com.ss.assignment.four;

import java.util.Stack;

public class Threads{
	
	public static void main(String[] args) {
		final Stack<Integer> buffer = new Stack<Integer>();
		System.out.println("hey you will see some threads doing work here");	

		Runnable producer = new Runnable() {
			@Override
			public void run() {
				System.out.println("pushing: 5");
				buffer.push(new Integer("5"));
				System.out.println("pushing: 6");
				buffer.push(new Integer("6"));
				System.out.println("pushing: 7");
				buffer.push(new Integer("7"));
				System.out.println("pushing: 8");
				buffer.push(new Integer("8"));
				System.out.println();
			}
		};
		
		Runnable consumer = new Runnable() {
			@Override
			public void run() {
				System.out.println("Popping: " +buffer.pop());
				System.out.println("Popping: " +buffer.pop());
				System.out.println("Popping: " +buffer.pop());
				System.out.println("Popping: " +buffer.pop());
			}
		};
		
		producer.run();
		consumer.run();
		
	}
	
}
