/*Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 3
Due: 2/19/2023
Submitted: 2/19/2023
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

	// Static variables
	public static final int NUM_WEEKS = 5;
	public static final int DAYS_PER_WEEK = 7;
	
	public UI() {}
	
	/**
	 * Calls methods to interact with user
	 * @param f (Franchise object)
	 */
	public void talkToUser(Franchise f) {
		
		printWelcomeMessage();
		
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;
		
		while (keepRunning) {
			int storeIndex = getStoreChoice(scanner);
			if (storeIndex != -1) {
				Store store = f.getStores(storeIndex);
				store.analyzeresults();

				printMenu();
				int selection = getMenuSelection(scanner);
				
				switch (selection) {
					case 1:
						printSalesForEachWeek(store);
						break;
					case 2:
						printAverageDailySales(store);
						break;
					case 3:
						printTotalSalesForAllWeeks(store);
						break;
					case 4:
						printAverageWeeklySales(store);
						break;
					case 5:
						printWeekWithHighestSales(store);
						break;
					case 6:
						printWeekWithLowestSales(store);
						break;
					case 7:
						printAllAnalytics(store);
						break;
					case -1:
						keepRunning = false;
						System.out.print("\nYour selection: -1 to quit. Goodbye. \n");
						break;
					default:
						System.out.printf("Invalid selection. Please try again. \n");
						break;
				}
			}
			else {
				keepRunning = false;
				System.out.print("\nYour selection: -1 to quit. Goodbye. \n");
			}
		}
	}
	
	/**
	 * Prints welcome message
	 */
	private void printWelcomeMessage() {
		System.out.printf("Welcome to the Franchise App! \n");
		System.out.printf("We have data for 6 stores for the last 5 weeks.\n");
	}
	/**
	 * Gets store selection from user
	 * @param scanner
	 * @return storeIndex (int)
	 */
	private int getStoreChoice(Scanner scanner) {
	    int storeIndex = 0;
	    while (storeIndex < 1 || storeIndex > 6) {
	        try {
	            System.out.printf("\nSelect a store # you want to see analytics for (-1 to quit): ");
	            storeIndex = scanner.nextInt();
	            if(storeIndex == -1) {
	                return storeIndex;
	            }
	            if (storeIndex < 1 || storeIndex > 6) {
	                System.out.printf("Invalid store number. Please try again.\n");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a valid store number.");
	            scanner.nextLine(); // consume the invalid input to prevent an infinite loop
	        }
	    }
	    System.out.printf("Your selected: store #%d %n%n", storeIndex);
	    return storeIndex - 1; // subtract 1 to get the actual store index
	}
	/**
	 * Prints selection menu
	 */
	private void printMenu() {
		
		System.out.printf("1. Enter 1 for total sales for each week \n");
		System.out.printf("2. Enter 2 for average daily sales for each week \n");
		System.out.printf("3. Enter 3 for total sales for all weeks \n");
		System.out.printf("4. Enter 4 for average weekly sales \n");
		System.out.printf("5. Enter 5 for week with the highest amount in sales \n");
		System.out.printf("6. Enter 6 for week with the lowest amount in sales \n");
		System.out.printf("7. Enter 7 for all analytical data \n");
		
	}
	
	/**
	 * Gets menu selection from user
	 * @param scanner
	 * @return selection (int)
	 */
	private int getMenuSelection(Scanner scanner) {
	    int selection = 0;
	    boolean validInput = false;
	    while (!validInput) {
	        try {
	        	System.out.printf("\nSelect an operation: ");
	            selection = scanner.nextInt();
	            if ((selection >= 1 && selection <= 7) || selection == -1) {
	                validInput = true;
	            } else {
	                System.out.printf("Invalid selection. Please try again. \n");
	            }
	        } catch (InputMismatchException e) {
	            System.out.printf("Invalid input. Please enter a number. \n");
	            scanner.next(); // clear scanner buffer
	        }
	    }
	    return selection;
	}

	/**
	 * Print sales for each week
	 * @param store
	 */
	public void printSalesForEachWeek(Store store) {

	    float[] totalWeeklySales = store.getTotalWeeklySales();
	    
	    System.out.printf("\nTotal Sales for Each Week:\n");
	    
	    for (int week = 0; week < NUM_WEEKS; week++) {
	        System.out.printf("Week %d: $%.2f\n", week + 1, totalWeeklySales[week]);
	    }
	}
	/**
	 * Prints average daily sales
	 * @param store
	 */
	public void printAverageDailySales(Store store) {
		
		float[] weeklySalesAverages = store.getWeeklySalesAverages();
		
	    System.out.printf("\nAverage Daily Sales for Each Week:\n");
	    
	    for (int week = 0; week < NUM_WEEKS; week++) {
	        System.out.printf("Week %d: $%.2f\n", week + 1, weeklySalesAverages[week]);
	    }

	}
	/**
	 * Prints total sales for ALL weeks
	 * @param store
	 */
	public void printTotalSalesForAllWeeks(Store store) {
		System.out.printf("\nTotal Sales for All Weeks: $%.2f\n", store.getTotalSales());
	}
	/*
	 * Prints average weekly sales
	 * @param store
	 */
	public void printAverageWeeklySales(Store store) {
		System.out.printf("\nAverage Weekly Sales: $%.2f\n", store.getAverageAllWeeks());
		
	}
	/**
	 * Prints week with highest sales
	 * @param store
	 */
	public void printWeekWithHighestSales(Store store) {
		System.out.printf("\nWeek with the Highest Amount in Sales: %d\n", store.getTopSalesWeek());
	}
	/**
	 * Prints week with lowest sales
	 * @param store
	 */
	public void printWeekWithLowestSales(Store store) {
		System.out.printf("\nWeek with the Lowest Amount in Sales: %d\n", store.getLowSalesWeek());
	}

	/**
	 * Prints all analytics
	 * @param store
	 */
	public void printAllAnalytics(Store store) {
		store.print();
	}
}
