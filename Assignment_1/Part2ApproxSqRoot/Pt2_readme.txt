Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment: 1 pt2 - Pg. 239 Problem 6.22 (Approximate the square root)
Due: Wed, 25 Jan 2023
Submitted: Wed, 25 Jan 2023

Program Description:

Implement the sqrt method using the Babylonian Method.
 

Program specs:

	Approximates the square root of a number, n, by repeatedly performing a calculation using the following formula:
	nextGuess = (lastGuess + n / lastGuess) / 2
	When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root. 
	The initial guess can be any positive value (e.g., 1).
	This value will be the starting value for lastGuess. 
	If the difference between nextGuess and lastGuess is less than a very small number, 
	such as 0.0001, you can claim that nextGuess is the approximated square root of n. 
	If not, next-Guess becomes lastGuess and the approximation process continues. 

	
Program design:

	Variables
		(double) lastGuess
		(double) nextGuess
	

	Input
	
		(long) n: value to find the square root of
	
	Processing
	
	    double lastGuess = 1;
    	double nextGuess = (lastGuess + n / lastGuess) / 2;
    	while (Math.abs(nextGuess - lastGuess) > 0.0001) {
	        lastGuess = nextGuess;
	        nextGuess = (lastGuess + n / lastGuess) / 2;
		}

	Printing
	
		Print formatted results using system.out.printf();
