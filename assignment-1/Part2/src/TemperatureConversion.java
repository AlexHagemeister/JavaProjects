/*
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment: -1 (Part 2)
Due: 01/18/2023
Submitted: 01/17/2023

Program Description:
 
	Prompts the user to enter a temperature reading in Centigrade
	and prints the equivalent Fahrenheit value. 
	It then asks the user to enter a Fahrenheit value 
	and prints out the equivalent Centigrade value. 

Centigrade to Fahrenheit: ˚F = 32 + ˚C (180.0 / 100.0)
Fahrenheit to Centigrade: ˚C = (100.0/180.0) / (˚F - 32)

*/

import java.util.Scanner; // Scanner class for reading user input
import java.util.InputMismatchException;

public class TemperatureConversion {

	public static void main(String[] args) { 
		
		float degC = 0.0f, degF = 0.0f;

		// Create Scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
		// Get valid entry for degrees Centigrade, convert to Fahrenheit, and print
		degC = getValidFloat(scanner, "Enter temperature in ˚C to convert to ˚F: ");
		degF = centigradeToFahrenheit(degC);
		System.out.printf("%.3g˚C is equal to %.3g˚F\n\n", degC, degF);
		
		// Get valid entry for degrees Fahrenheit, convert to Centigrade, and print
		degF = getValidFloat(scanner, "Enter temperature in ˚F to convert to ˚C: ");
		degC = fahrenheitToCentigrade(degF);
		System.out.printf("%.3g˚F is equal to %.3g˚C\n\n", degF, degC);
		
		// Close scanner 
		scanner.close();
	
	}

	/** 
	 * getValidInput is used to validate user input.
	 * Implementation: experimenting with try/catch block for exception handling
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
		
		/** 
		 * centigradeToFahrenheit conversion method: ˚F = 32 + ˚C (180.0 / 100.0)
		 * @param float ˚C
		 * @return float ˚F
		 */	
		public static float centigradeToFahrenheit(float degInC) {
			
			float degInF = 32.0f + degInC * (180.0f/100.0f);
			return degInF;
		}
		/** 
		 * fahrenheitToCentigrade conversion method: ˚C = (100.0/180.0) / (˚F - 32)
		 * @param float ˚F
		 * @return float ˚C
		 */	
		public static float fahrenheitToCentigrade(float degInF) {
			
			float degInC = (100.0f/180.0f) * (degInF - 32.0f);
			return degInC;
		}
} 
