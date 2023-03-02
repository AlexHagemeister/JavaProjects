/*
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment: -1 (Part 1)
Due: 01/18/2023
Submitted: 01/16/2023

Program Description: Creates a customer's bill for a company selling 5 products. 

Prompts user for quantity of each item purchased, 
reads in user input, 
computes and prints formatted bill. 

Program specs: 
Define constants for the unit prices and the tax rate. 
Use integer variables to store the quantities for each item. 
Use floating-point variables to store 
	-the total price of each item, 
	-the bill subtotal, the tax amount 
	-the total amount of the bill.
	
Format the output adequately showing the 4 columns (QTY, DESCRIPTION, UNIT PRICE, TOTAL PRICE) 
in a single row. Use System.out.printf for output.

 */


import java.util.Scanner; // Scanner class for reading user input

public class BillOfSale {

	public static void main(String[] args) {
		
		// Use 'final' keyword to define constants for prices & tax,
		// Use suffix 'f' to tell compiler to treat as float (type double by default)
        final float TV_PRICE = 400.00f;
        final float VCR_PRICE = 220.00f;
        final float REMOTE_PRICE = 35.20f;  
        final float CD_PLAYER_PRICE = 300.00f;		
        final float TAPE_RECORDER_PRICE = 150.00f;	
        final float TAX_RATE = 0.0825f;
        
        // Create Scanner object to read input from InputStream (System.in is an InputStream)
        // Remember: close after using
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for item quantities & read input using a getValidInt method (validates input)
        int tvQty = getValidInt(scanner, "How many TVs were sold? ");
        int vcrQty = getValidInt(scanner, "How many VCRs were sold? ");
        int remoteQty = getValidInt(scanner, "How many remote controllers were sold? ");
        int cdPlayerQty = getValidInt(scanner, "How many cd players were sold? ");
        int tapeRecorderQty = getValidInt(scanner, "How many tape recorders were sold? ");
        System.out.printf("%n");
        
        // Close scanner object after done using it 
        scanner.close();
        
        // Compute item totals
        float tvTotal = tvQty * TV_PRICE;
        float vcrTotal = vcrQty * VCR_PRICE;
        float remoteTotal = remoteQty * REMOTE_PRICE;
        float cdTotal = cdPlayerQty * CD_PLAYER_PRICE;
        float tapeTotal = tapeRecorderQty * TAPE_RECORDER_PRICE;
        
        // Compute subtotal, tax, and total
        float subtotal = tvTotal + vcrTotal + remoteTotal + cdTotal + tapeTotal;
        float tax = subtotal * TAX_RATE;
        float total = subtotal + tax;
        
        /* Print formatted bill. 
         * NOTE: used formatting args that differ somewhat from lecture
         * %5d tells 'printf' to format the 1st arg: 5 = width, d = int format
         * %20s tells 'printf' to format the 2nd arg: 20 = width, s = string
         * %15.2f tells 'printf' to format the 3rd & 4th args: 15 = width, .2 = 2 decimal places, f = float
         */
        System.out.printf("%5s %20s %15s %15s\n", "QTY", "DESCRIPTION", "UNIT PRICE", "TOTAL PRICE");    
        printPurchaseTotals(tvQty, "TV", TV_PRICE, tvTotal);
        printPurchaseTotals(vcrQty, "VCR", VCR_PRICE, vcrTotal);
        printPurchaseTotals(remoteQty, "Remote Controller", REMOTE_PRICE, remoteTotal);
        printPurchaseTotals(cdPlayerQty, "CD Player", CD_PLAYER_PRICE, cdTotal);
        printPurchaseTotals(tapeRecorderQty, "Tape Recorder", TAPE_RECORDER_PRICE, tapeTotal);
        System.out.printf("%n");
	    System.out.printf("%5s %20s %15s %15.2f\n", "", "", "Subtotal:", subtotal);
	    System.out.printf("%5s %20s %15s %15.2f\n", "", "", "Tax:", tax);
	    System.out.printf("%5s %20s %15s %15.2f\n", "", "", "Total:", total);
	} 
	
	/** 
	 * getValidInput is used to validate user input.
	 * @param scanner object
	 * @param string prompt
	 * @return validated integer
	 */	
		public static int getValidInt(Scanner scanner, String userPrompt) {
	    int number;
	    while (true) {								// Loop repeats until valid input entered
	        System.out.print(userPrompt);			// Print prompt
	        if (scanner.hasNextInt()) {				// if hasNextInt() == True,
	            number = scanner.nextInt();			// 		number = input
	            scanner.nextLine();  				// 		consume the newline character
	            break;								// 		breaks from loop to return number
	        	}
	        System.out.printf("Invalid input. Please enter a number.\n");	// if hasNextInt == False, print error, 
	        scanner.nextLine();														
	    	}
	    return number;  
		} 
		
		/**
		 * printPurchaseTotals prints formatted purchase attributes for each item
		 * @param itemQty - int number of items purchased
		 * @param itemName - String item description
		 * @param unitPrice - float unit price
		 * @param totalPrice - float total cost for item(s)
		 */
		public static void printPurchaseTotals(int itemQty, String itemName, float unitPrice, float totalPrice) {
	       /* %5d tells 'printf' to format the 1st arg: 5 = width, d = int format
	        * %20s tells 'printf' to format the 2nd arg: 20 = width, s = string
	        * %15.2f tells 'printf' to format the 3rd & 4th args: 15 = width, .2 = 2 decimal places, f = float
	        */
			System.out.printf("%5d %20s %15.2f %15.2f\n", itemQty, itemName, unitPrice, totalPrice);
		}
}
