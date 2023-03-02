File: Pt1_readme.txt
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 1 Pt1: Pg. 194 Problem 5.22 (Loan Amortization Schedule)
Due: Wed, 25 Jan 2023
Submitted: ____

Program Description: Loan amortization schedule 
 
	Lets the user enter the loan amount, number of years, and interest rate 
	and displays the amortization schedule for the loan.


Program specs:

	- The monthly payment for a given loan pays the principal and the interest. 
	- The monthly interest is computed by multiplying the monthly interest rate and the balance. 
	- The principal paid for the month is therefore the monthly payment mins the monthly interest. 
	- The balance after the last payment may not be zero. If so, the last payment should be the normal 
	monthly payment plus the final balance.

	
Program design:

	Variables
	
		User-defined:
		(float) loanAmount
		(float) monthlyInterestRate
		(float) numberOfYears 
		
		Computed:
		(float) monthlyPayment: same for each month, and should be computed before the loop.
		(float) principal:
		(float) interest:
		(float) balance: the remaining principal owed, initially equal to loan amount	
	
	Input
	
		Use a Scanner object to read in user input for:
		- loanAmount
		- monthlyInterestRate
		- numberOfYears 
	
	Processing
		
		Use a loop to compute and display the table. 
		For each iteration in the loop, compute the interest and principal, and update the balance.
		
		interest = monthlyInterestRate * balance
		principal = monthlyPayment - interest
		balance = balance - principal 
		Then, print formatted results

	Printing
	
		Print table header prior to processing/printing loop.
