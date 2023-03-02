/**
 * @filename LoanAmortizationSchedule.java
 * @author Alex Hagemeister
 * @course.section CIS D035A.63Z
 * @assignment 1 Pt1: Pg. 194 Problem 5.22 (Loan Amortization Schedule)
 * @due Wed, 25 Jan 2023
 * @submitted Wed, 25 Jan 2023
 * 
 * @description Lets the user enter the loan amount, number of years, and interest rate 
 * and displays the amortization schedule for the loan.
 */

import java.util.Scanner;
import java.lang.Math;

public class LoanAmortizationSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//

		// User-defined:
		float loanAmount;
		float annualInterestRate;
		float numberOfYears;
		
		// Computed:
        float monthlyPayment;
        float monthlyInterestRate;
        float numberOfPayments;
        float interest;
        float principal;
        float balance;
		
		Scanner scanner = new Scanner(System.in);
		
		loanAmount = getValidFloat(scanner, "Enter Loan amount: ");
		annualInterestRate = getValidFloat(scanner, "Enter Interest Rate: ");
		numberOfYears = getValidFloat(scanner, "Enter duration of loan in years: ");
		balance = numberOfYears;
		
		scanner.close();
		
        // calculate monthly interest rate
        monthlyInterestRate = annualInterestRate / 12 / 100;
		
        // calculate number of payments
        numberOfPayments = numberOfYears * 12;
        
        // set initial balance
        balance = loanAmount;
	  
        // calculate monthly payment
        try{
            monthlyPayment = (float) (loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))));
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            return;
        }
       
		System.out.printf("Monthly payment: %.2f\n", monthlyPayment);
		System.out.printf("Total payment: %.2f\n", monthlyPayment * numberOfPayments);
		
        System.out.printf("%5s %15s %15s %15s\n", "Payment #", "Interest", "Principal", "Balance");
		
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%5d %15.2f %15.2f %15.2f\n", i, interest, principal, balance);
		}
	}

	/** 
	 * @getValidInput used to validate user input.
	 * @param scanner object
	 * @param string prompt
	 * @return validated float
	 */	
	public static float getValidFloat(Scanner scanner, String userPrompt) {
		
		boolean valid = false; 
		float input = 0.0f;
		
		while (!valid) {
			System.out.print(userPrompt);
			// Try to parse a float from entry
			try { 				
				input = Float.parseFloat(scanner.nextLine());
				valid = true;	// If success, entry IS valid
			} 
			// throws exception if entry is invalid
			catch (NumberFormatException e) {		
				System.out.printf("Invalid input. Please try again.\n");
			}
		}
	return input;
	} 

}