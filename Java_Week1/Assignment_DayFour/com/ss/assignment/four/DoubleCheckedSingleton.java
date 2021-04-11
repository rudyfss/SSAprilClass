/*
 *  inside the package for day four assignments
 */
package com.ss.assignment.four;

/*
 * The purpose of this class is to make a singleton class
 * where we check to make sure we should create a lock (thread synchronization)
 * for a singleton instance. This is meant to stop the creation of 
 * unnecessary locks for an instance we may not have created. 
 */

public class DoubleCheckedSingleton {
	//NOTE: USE VOLATILE TO SYNCHRONIZE VARIABLES BUT ONLY FOR ONE INSTANCE AND NOT MULTIPLE INSTANCES
	volatile private static DoubleCheckedSingleton oneAndOnlyInstance;
	
	public static DoubleCheckedSingleton getInstance() {
		if (oneAndOnlyInstance == null ) {
			synchronized (oneAndOnlyInstance) {
				if (oneAndOnlyInstance == null ) {
					oneAndOnlyInstance = new DoubleCheckedSingleton();
				}
			}
		}
		
		return oneAndOnlyInstance;
	}
	

	
}
