/*Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 3
Due: 2/19/2023
Submitted: 2/19/2023
*/

import java.io.*;
import java.util.*;

public class FileIO {
	// Instance variables
	private String fname = null;
	private boolean DEBUG = false;

	// Constructor
	public FileIO(String fname) {
		this.fname = fname;
	}

	// Reads data from file and returns Franchise object
	public Franchise readData() {
		Franchise a1 = null;
		int counter = 0;
		try {
			// Create FileReader and BufferedReader objects to read data from file
			FileReader file = new FileReader(fname);
			BufferedReader buff = new BufferedReader(file);
			String temp;
			boolean eof = false;

			// Loop until end of file
			while (!eof) {
				String line = buff.readLine();
				counter++;

				// If line is null, end of file has been reached
				if (line == null)
					eof = true;
				else {
					// If debug mode is enabled, print the line being read
					if (DEBUG)
						System.out.println("Reading" + line);

					// If counter is 1, create a new Franchise object with the number of stores
					if (counter == 1) {
						temp = line;
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}

					// If counter is 2, do nothing
					if (counter == 2)
						;
					// If counter is greater than 2, create a new Store object and add it to the Franchise object
					if (counter > 2) {
						// Build store with counter offset for correct indexing
						int x = buildStore(a1, (counter-3), line);
						if (DEBUG)
							System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
						if (DEBUG)
						{	
							System.out.println("Data read:");
							a1.getStores(counter-3).printdata();
						}
					}
				}
			}
			// Close the BufferedReader object
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		
		// Return the Franchise object
		return a1;
	}

	// Create a new Store object and add it to the Franchise object
	public int buildStore(Franchise a1, int counter, String temp) {
		// Create a new Store object
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;

		// Use StringTokenizer to read data from the input line
		StringTokenizer st = new StringTokenizer(temp);
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
		    	 s1 = st.nextToken();
		         sale = Float.parseFloat(s1);
	        	 tstore.setsaleforweekdayintersection(week, day, sale);
	         }
	         week++;
	    }

	    // Add the Store object to the Franchise object
		a1.setStores(tstore, counter);

		// Return the number of weeks read
	    return week; 
	}
	public void print() {
		System.out.printf("String fname: %s %n", fname);
		System.out.printf("boolean DEBUG: %b %n", DEBUG);
	}
}
