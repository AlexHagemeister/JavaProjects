/**
 * Name: Alex Hagemeister
 * Course.Section: CIS D035A.63Z
 * Assignment 2 pt2: Nucleic Acid
 * File: GenoNucleicAcid.java
 * Due: 2/12/2023
 * Submitted: 2/12/2023
 */
import java.util.Scanner;

public class GenoNucleicAcid {

	// Driver method instantiates NucleicAcid objects & prints their data
	public static void main(String[] args) {
		
		final int NUM_ENTRIES = 1;
		
		// Create array to hold NucleicAcid objects
		NucleicAcid[] dataset = new NucleicAcid[NUM_ENTRIES];
		
		Scanner scanner = new Scanner(System.in);
		
		// Populate array with NucleicAcid instanced populated with input
		for(int i = 0; i < NUM_ENTRIES; i++) {
			dataset[i] = input(scanner);
		}
		
		scanner.close();
		
		// Print the information stored in all NucleicAcid instances using their print methods.
		for(int i = 0; i < NUM_ENTRIES; i++) {
			dataset[i].print();
		}

	}
	/**
	 * input() gets valid NucleicAcid data from user
	 * @param scanner
	 * @return NucleicAcid object
	 */
	public static NucleicAcid input(Scanner scanner) {
		
		System.out.printf("Enter name of nucleic acid: ");
		String name = scanner.nextLine();
		
		System.out.printf("Enter chemical formula: ");
		String chemicalFormula = scanner.nextLine();
		
		System.out.printf("Enter molar mass (g/mol): ");
		float molarMass = getValidPosFloat(scanner);
		
		System.out.printf("Enter Density (g/cm^3): ");
		float density = getValidPosFloat(scanner);
		
		System.out.printf("%n");
		
		return new NucleicAcid(name, chemicalFormula, molarMass, density);
	}
	/**
	 * getValidPosFloat validates input is of correct type
	 * @param input (Scanner)
	 * @return (float) validated input
	 */
	protected static float getValidPosFloat(Scanner scanner) {
	    while (true) {
	        try {
	            // Get user input and validate
	            String input = scanner.nextLine();
	            float number = Float.parseFloat(input);
	            // Negative or zero entries are invalid
	            if (number <= 0) {
	                System.out.printf("Invalid entry, try again: ");
	                continue;
	            }
	            // Return validated entry upon success
	            return number;
	        } 
	        // Otherwise, throw exception
	        catch (NumberFormatException e) {
	            System.out.printf("Invalid entry, try again: ");
	        }
	    }
	}
}
