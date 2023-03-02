/**
 * Name: Alex Hagemeister
 * Course.Section: CIS D035A.63Z
 * Assignment 2 pt 1: Human Genome Lab
 * File: GenomeInput.java
 * Due: 2/12/2023	
 */

// Import the Scanner class from the java.util package
import java.util.Scanner;

public class GenomeInput {
	
	// Constant to define the number of genomes to process
	final static int NUM_GENOMES = 3; 

	/**
	 * The Driver method (main) calls the input method from GenomeInput 
	 * to create three instances of HumanGenome populated with user input.
	 */
	public static void main(String[] args) {
 

		// Create an array of HumanGenome objects with length 3
		HumanGenome[] genomes = new HumanGenome[NUM_GENOMES];

		// Use a for loop to read information for each of the 3 HumanGenome objects
		for (int i = 0; i < NUM_GENOMES; i++) {
				genomes[i] = input();
			} 
		// Print object properties
		print(genomes);
	}

	public static HumanGenome input() {
		/**
		 * input method prompts user, and gets valid input using a protected method getValidUnsignedInt()
		 * 
		 * @return HumanGenome object w/ properties initialized to user inputs
		 */

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the genome details, read inputs, and assign to appropriate labels
		// Validates input when necessary
		System.out.printf("Enter Genome Name: ");
		String genomeName = scanner.nextLine();
		
		System.out.printf("Enter Number of Genes: ");
		int numGenes = getValidUnsignedInt(scanner);
		
		System.out.printf("Enter Number of Chromosomes: ");
		int numChromosomes = getValidUnsignedInt(scanner);
		
		System.out.printf("Enter Number of Cells (x10e12): ");
		int numCells = getValidUnsignedInt(scanner);

		System.out.printf("%n");
		
		// Return a new HumanGenome object initialized with the values entered by the user 
		return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
	}
	
	public static void print(HumanGenome[] genomes) {
		System.out.printf("** Printing genome data ** %n%n");
		
		// Use another for loop to print the information for each of the 3 HumanGenome objects
		// Calls the print method of the current HumanGenome object to display its information
		for (int i = 0; i < NUM_GENOMES; i++) {
			genomes[i].print();
		}
	}
	/**
	 * getValidUnsignedInt validates input is of correct type
	 * @param input
	 * @return validated input
	 */
	protected static int getValidUnsignedInt(Scanner input) {
		while (true) {
			try {
				// Get user input and attempt to parse as an int
				String line = input.nextLine();
				int number = Integer.parseInt(line);
				// Negative entries are invalid
				if (number < 0) {
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
