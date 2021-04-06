/**
 * 
 */
package com.ss.assignment.one;

/**
 * @author Rudyf
 *
 */
public class PrintPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//PRINT SECTION 1
		System.out.println("1)");
		
		//PRINT TRIANGLE
		for (int i=0; i < 4; i++) {
			for (int j=-1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//PRINT DOTTED LINE
		for (int i=0; i < 10; i++) {
			System.out.print(".");
		}
		
		System.out.println();
		
		//PRINT SECTION 2
		System.out.println("2)");
		
		//PRINT DOTTED LINE
		for (int i=0; i < 11; i++) {
			System.out.print(".");
		}
		
		System.out.println();
		
		//PRINT TRIANGLE
		for (int i=0; i < 4; i++) {
			for (int j=i; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//PRINT SECTION 3
		System.out.println("3)");
		
		//PRINT TRIANGLE
		for (int i=0; i < 4; i++) {
			System.out.print("  ");
			for (int space=i; space < 3; space++) {
				System.out.print(" ");
			}
			
			//PRINT RIGHT TRIANGLE
			for (int j=0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			//PRINT RIGHT TRIANGLE BUT STARTING ON NEXT ROW
			for (int k=1; k < i + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//PRINT DOTTED LINE
		for (int i=0; i < 11; i++) {
			System.out.print(".");
		}
			System.out.println();
		
		//PRINT SECTION 4
		System.out.println("4)");
		
		//PRINT DOTTED LINE
		for (int i=0; i < 12; i++) {
			System.out.print(".");
		}
		System.out.println();
		//PRINT TRIANGLE
		for (int i=0; i < 4; i++) {
			System.out.print("  ");
			
			
			for (int space=0; space < i; space++) {
				System.out.print(" ");
			}
			
			//PRINT RIGHT TRIANGLE
			for (int j=i; j < 4; j++) {
				System.out.print("*");
			}
			
			//PRINT RIGHT TRIANGLE BUT STARTING ON NEXT ROW
			for (int j=i+1; j < 4; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
