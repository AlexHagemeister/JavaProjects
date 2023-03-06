/* 
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023 
*/

package studentscoreanalysis;

/**
 * The Statistics class is used to store the lowest, highest, and average scores
 * for 5 quizzes.
 * 
 * @author Alex Hagemeister
 * @version 1.0
 * @since March 7, 2023
 */
public class ScoreStatisticsDriver {
	public static void main(String[] args) {

		int defaultNumStudents = 40;						// Set default array size to avoid magic numbers
		Student[] lab2 = new Student[defaultNumStudents]; 	// Create an array of Student objects
		Util fileParser = new Util();						// Create a Util object to read the file

		// Set the file name
		String fileName = "/Users/alexhagemeister/Java/JavaProjects/Lab5_StudentScoreAnalysis/src/TestScores.txt";

		// Read the file by passing to the Util objects readFile method, which updates the lab2 array
		fileParser.readFile(fileName, lab2);

		// Create a new array of the correct size
		Student[] lab2Resized = new Student[fileParser.getNumStudents()];

		// Copy the data from the old array to the new array
		for (int student = 0; student < lab2Resized.length; student++) {
			lab2Resized[student] = lab2[student];
		}

		// Create a Statistics object to analyze the data
		Statistics statLab2 = new Statistics(lab2Resized);

		printMenu(); 	// Print the menu

		// Set the valid range for user input to avoid magic numbers
		int validMin = 1;
		int validMax = 5;

		// Loop until user selects 5 to exit program
		while (true) {
			int userSelection = getUserSelection(validMin, validMax);
			if (userSelection == 5) {
				System.out.printf("%nExiting program... %n%n");
				break;
			}
			else {
				statLab2.printSelected(userSelection);
				System.out.printf("%n");
			}
		}
	}
	
	// Prints the menu
	public static void printMenu() {
		System.out.printf("%nSelect from the follwing options: %n");
		System.out.printf("1. Print high scores for each quiz %n");
		System.out.printf("2. Print low scores for each quiz %n");
		System.out.printf("3. Print average scores for each quiz %n");
		System.out.printf("4. Print all statistics for each quiz %n");
		System.out.printf("5. EXIT PROGRAM %n%n");
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
				// Read user input and try to parse to int
				int userSelection = Integer.parseInt(System.console().readLine());
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
}
