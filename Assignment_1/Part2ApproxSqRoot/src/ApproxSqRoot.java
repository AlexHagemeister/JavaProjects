/**
 * @filename ApproxSqRoot.java
 * @author Alex Hagemeister
 * @course.section CIS D035A.63Z
 * @assignment 1 Pt1: Pg. 194 Problem 5.22 (Loan Amortization Schedule)
 * @due Wed, 25 Jan 2023
 * @submitted Wed, 25 Jan 2023
 * 
 * @description Implement the sqrt method using the Babylonian Method.
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class ApproxSqRoot {

	// main used to test sqrt method
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);					// create scanner to read input
		long userInput = 0l;
		boolean valid = false;
		while (!valid) {
			
			userInput = getValidLong(scanner, "Enter a value: ");	// pass to method for input validation
			if (userInput < 0) {
				System.out.printf("Cannot be negative. Try again\n");
			}
			else {
				valid = true;
			}
		}
		
		scanner.close();											// close to prevent data leaks
		
		// Print formatted sqrt results
		System.out.printf("The square root of %d is %.2f", userInput, sqrt(userInput));
		
	}
	
	/**
	 * @sqrt computes the square root w/ Babalonian method
	 * @param n (long)
	 * @return the square root of n
	 */
	public static double sqrt(long n) {
	    double lastGuess = 1;
	    double nextGuess = (lastGuess + n / lastGuess) / 2;
	    while (Math.abs(nextGuess - lastGuess) > 0.0001) {
	        lastGuess = nextGuess;
	        nextGuess = (lastGuess + n / lastGuess) / 2;
	    }
	    return nextGuess;
	}
	/**
	 * @param scanner 
	 * @param userPrompt
	 * @return validated long value
	 */
	public static long getValidLong(Scanner scanner, String userPrompt) {
	    boolean valid = false; 
	    long input = 0;
	    while (!valid) {
	        System.out.print(userPrompt);
	        try { 				
	            input = scanner.nextLong();
	            valid = true;	
	        } 
	        catch (InputMismatchException e) {		
	            System.out.printf("Invalid input. Please try again.\n");
	            scanner.next();
	        }
	    }
	    return input;
	}

}
