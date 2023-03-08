/* 
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023 
*/

package driver;

import java.util.Scanner;

import model.Statistics;
import model.Student;
import util.FileIO;

/**
 * The Statistics class is used to store the lowest, highest, and average scores
 * for 5 quizzes.
 * 
 * @author Alex Hagemeister
 * @version 1.0
 * @since March 7, 2023
 */
public class Driver {
	public static void main(String[] args) {

		int defaultNumStudents = 40;						// Set default array size to avoid magic numbers
		FileIO fileParser = new FileIO();					// Create a Util object to read the file

		// ------------------------------------ //
		// TEST CASE 1: 15 records with header	//
		// ------------------------------------ //

		Student[] lab1 = new Student[defaultNumStudents]; 	// Create an array of Student objects

		// Read the file by passing to the Util objects readFile method, which updates the lab1 array
		fileParser.readFile("15_records_with_header.txt", lab1);

		fileParser.print();								// Print the file name
		Statistics statLab1 = new Statistics(lab1);		// Create a Statistics object 
		runAnalytics(statLab1);							// Run the analytics
		System.out.printf("%n*** END TEST CASE 1 ***%n%n");
		
		// // --------------------------------- //
		// // TEST CASE 2: 1 record with header //
		// // --------------------------------- //

		Student[] lab2 = new Student[defaultNumStudents];
		fileParser.readFile("1_record_with_header.txt", lab2);
		fileParser.print();
		Statistics statLab2 = new Statistics(lab2);
		runAnalytics(statLab2);	
		System.out.printf("%n*** END TEST CASE 2 ***%n%n");

		// ----------------------------------- //
		// TEST CASE 3: empty file with header //
		// ----------------------------------- //

		Student[] lab3 = new Student[defaultNumStudents];
		fileParser.readFile("empty_with_header.txt", lab3);
		fileParser.print();
		Statistics statLab3 = new Statistics(lab3);
		runAnalytics(statLab3);	
		System.out.printf("%n*** END TEST CASE 3 ***%n%n");

		// ----------------------------------- //
		// TEST CASE 4: 40 records with header //
		// ----------------------------------- //

		Student[] lab4 = new Student[defaultNumStudents];
		fileParser.readFile("40_records_with_header.txt", lab4);
		fileParser.print();
		Statistics statLab4 = new Statistics(lab4);
		runAnalytics(statLab4);	
		System.out.printf("%n*** END TEST CASE 4 ***%n%n");

		// ----------------------------------- //
		// TEST CASE 5: 42 records with header //
		// ----------------------------------- //

		Student[] lab5 = new Student[defaultNumStudents];
		fileParser.readFile("42_records_with_header.txt", lab5);
		fileParser.print();
		Statistics statLab5 = new Statistics(lab5);
		runAnalytics(statLab5);	
		System.out.printf("%n*** END TEST CASE 5 ***%n%n");

	}
	
	// Prints the menu
	public static void printMenu() {
		System.out.printf("%n%nSelect from the follwing options: %n");
		System.out.printf("1. Print high scores for each quiz %n");
		System.out.printf("2. Print low scores for each quiz %n");
		System.out.printf("3. Print average scores for each quiz %n");
		System.out.printf("4. Print all statistics for each quiz %n");
		System.out.printf("5. EXIT ANALYTICS %n%n");
	}

	/**
	 * Reads and validates user selection using try-catch block
	 * @param validMin minimum valid selection
	 * @param validMax maximum valid selection
	 * @return user selection
	 */
	public static int getUserSelection(int validMin, int validMax) {
		
		while (true) {	// Loop until user enters valid selection
			try {
				System.out.printf("Enter your selection: ");
				// Read user input using a scanner object and try to parse to int
				Scanner scanner = new Scanner(System.in);

				int userSelection = Integer.parseInt(scanner.nextLine());
				// Check if user selection is valid
				if (userSelection >= validMin && userSelection <= validMax) {
					return userSelection;
				} else {
					System.out.printf("Invalid selection. Please try again. %n");
				}
			} catch (NumberFormatException e) {
				System.out.printf("Invalid selection. Please try again. %n");
			}
		}
	}
	public static void runAnalytics(Statistics statLab) {
		printMenu(); 	// Print the menu

		// Set the valid range for user input to avoid magic numbers
		int validMin = 1;
		int validMax = 5;

		// Loop until user selects 5 to exit program
		while (true) {
			int userSelection = getUserSelection(validMin, validMax);
			if (userSelection == 5) {
				System.out.printf("%nExiting analytics for file... %n%n");
				break;
			}
			else {
				statLab.printSelected(userSelection);
				System.out.printf("%n");
			}
		}
	}
}
