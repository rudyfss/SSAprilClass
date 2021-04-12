
/**
 * In the package for day 5 assignments
 */
package com.ss.assignment.five;

/**
 * @author Rudyf
 *The purpose of this class is to see if we can setup 
 *a method that can process an array to see if we can get
 *a target sum based on the number to the left or right and the 
 *index position's sum
 */
public class TargetSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[] {2,4,8};
		int[] array2 = new int[] {1,2,4,8,1};
		int[] array3 = new int[] {2,4,4,8};

		System.out.println(groupSumClump(0, array1, 10));
		System.out.println(groupSumClump(0, array2, 14));
		System.out.println(groupSumClump(0, array3, 14));
	}
	
	public static boolean groupSumClump(int position, int[] array, int targetSum) {
		
		
		if (position < array.length-1) {
			
			if (position-1 >= 0) {
			
				if(array[position-1] + array[position] + array[position+1] == targetSum) {
					return true;
				}
				
				else {
					return groupSumClump(position +1, array, targetSum);
				}
				
				
			}
			
			else {
				if (array[position] + array[array.length-1] == targetSum) {
					return true;
				}
				else {
					return groupSumClump(position +1, array, targetSum);
				}
			}
			
		}
			
			return false;
		
	}

}
