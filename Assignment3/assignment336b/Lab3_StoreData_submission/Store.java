/*Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 3
Due: 2/19/2023
Submitted: 2/19/2023
*/

public class Store {
	
	// Instance variables
	private float salesbyweek[][];
	private float[] totalSalesForEachWeek;
	private float[] weeklySalesAverages;
	private float totalSales;
	private float averageAllWeeks;
	private int topSalesWeek;
	private int lowSalesWeek;

	// Static variables
	public static final int NUM_WEEKS = 5;
	public static final int DAYS_PER_WEEK = 7;

	// Default constructor
	Store() {
		salesbyweek = new float[NUM_WEEKS][DAYS_PER_WEEK];
		totalSalesForEachWeek = new float[NUM_WEEKS];
		weeklySalesAverages = new float[NUM_WEEKS];
		totalSales = 0;
		averageAllWeeks = 0;
		topSalesWeek = 0;
		lowSalesWeek = 0;
	}

	// getters and setters
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}
	
	public float[][] getSalesbyweek() {
		return salesbyweek;
	}

	public float[] getTotalWeeklySales() {
		return totalSalesForEachWeek;
	}

	public float[] getWeeklySalesAverages() {
		return weeklySalesAverages;
	}

	public float getTotalSales() {
		return totalSales;
	}

	public float getAverageAllWeeks() {
		return averageAllWeeks;
	}

	public int getTopSalesWeek() {
		return topSalesWeek;
	}

	public int getLowSalesWeek() {
		return lowSalesWeek;
	}


	/**
	 * Get sales for a particular week
	 * @param week (int)
	 * @return sales[]
	 */
	public float[] getsalesforentireweek(int week) {
		// create a new array to hold the sales data for the week
	    float[] thisWeekSales = new float[DAYS_PER_WEEK]; 
	    
	    // copy the sales data for each day of the week
	    for (int day = 0; day < DAYS_PER_WEEK; day++) {
	    	thisWeekSales[day] = salesbyweek[week][day]; 
	    }
	    return thisWeekSales;
		
	}
	/**
	 * Get sales for a specific day 
	 * @param week (int)
	 * @param day (int)
	 * @return salesbyweek (array)
	 */
	public float getsaleforweekdayintersection(int week, int day) {
		return salesbyweek[week][day];
	}
	
	
	// businessmethod
	
	/**
	 * 1. Get the total sales for each week
	 * @param none
	 * @return totalSalesForEachWeek (float[])
	 */
	protected float[] totalsalesforeachweek() {
		
		totalSalesForEachWeek = null;
		totalSalesForEachWeek = new float[NUM_WEEKS];
	
		for (int week = 0; week < NUM_WEEKS; week++) {
			
			float[] thisWeekSales = getsalesforentireweek(week);
			for (int day = 0; day < DAYS_PER_WEEK; day++) {
				totalSalesForEachWeek[week] += thisWeekSales[week];
			}
		}
		return totalSalesForEachWeek;
	}
	
	/**
	 * 2. Calculate the average sales for each week and return the averages
	 * @param none
	 * @return totalSalesForWeek (float[])
	 */
	protected float[] avgsalesforeachweek() {
		
		// get the total sales for each week using the totalsalesforeachweek method
	    //float[] totalSalesForEachWeek = totalsalesforeachweek(); 
	    //float[] averageSalesForEachWeek = new float[NUM_WEEKS];
		
		weeklySalesAverages = null;
		weeklySalesAverages = new float[NUM_WEEKS];
		
	    
	    // calculate the average sales by dividing the weekly total by the number of days
	    for (int week = 0; week < NUM_WEEKS; week++) {
	    	weeklySalesAverages[week] = totalSalesForEachWeek[week] / DAYS_PER_WEEK;
	    }
	    return weeklySalesAverages;
	}
	
	/**
	 * 3. Sum up the sales for all the weeks and return the total
	 * @return totalSalesForAllWeeks (float[])
	 */
	protected float totalsalesforallweeks() {
	    float totalSalesForAllWeeks = 0.0f;
	    float[] totalSalesForEachWeek = totalsalesforeachweek();
	    for (int week = 0; week < NUM_WEEKS; week++) { 
        	totalSalesForAllWeeks += totalSalesForEachWeek[week];
	    }
	    return totalSalesForAllWeeks;
	}

	
	/**
	 * 4. Calculate the average sales for all weeks
	 * @return AverageWeeklySales
	 */
	protected float averageweeklysales() {
		averageAllWeeks = (totalsalesforallweeks() / NUM_WEEKS); 
	    return averageAllWeeks;
	}


	/**
	 * 5. Iterate over all the weeks and find the week with the highest total sales
	 * @return maxWeek (int)
	 */
	protected int weekwithhighestsaleamt() {
	    float maxSales = 0.0f;
	    int maxWeek = 0;
	    float[] weekSales = totalsalesforeachweek();
	    
	    for (int week = 0; week < NUM_WEEKS; week++) { // assumes there are NUM_WEEKS weeks
	        if (weekSales[week] > maxSales) { 
	            maxSales = weekSales[week];
	            maxWeek = week;
	        }
	    }
	    return maxWeek;
	}
	
	/**
	 * 6. Iterate over all the weeks in the salesbyweek array and find the week with the lowest total sales
	 * @return minWeek (int)
	 */
	protected int weekwithlowestsaleamt() {
	    float minSales = 0.0f;
	    int minWeek = 0;
	    float[] weekSales = totalsalesforeachweek();
	    
	    for (int week = 0; week < NUM_WEEKS; week++) { // assumes there are NUM_WEEKS weeks
	        if (weekSales[week] < minSales) { 
	            minSales = weekSales[week];
	            minWeek = week;
	        }
	    }
	    return minWeek;
	}

	// analyzeresults //call a through f
	
	/**
	 * Used to update instance variables so they can be printed without recalculating each time
	 * @param stores (array)
	 * @return
	 */
	protected void analyzeresults() {
		totalSalesForEachWeek = totalsalesforeachweek(); 	// 1
		weeklySalesAverages = avgsalesforeachweek();		// 2
		totalSales = totalsalesforallweeks();				// 3
		averageAllWeeks = averageweeklysales();				// 4
		topSalesWeek = weekwithhighestsaleamt();			// 5
		lowSalesWeek = weekwithlowestsaleamt();				// 6
	}


	/**
	 * Prints store data
	 */
	public void printdata() {
		for (int week = 0; week < NUM_WEEKS; week++)
		{
			for (int day = 0; day < DAYS_PER_WEEK; day++)
			{
				System.out.print(salesbyweek[week][day] + " ");
			}
			System.out.println("");
		}
	}
	/**
	 * Prints all instance variables
	 */
	public void print() {

	    System.out.printf("\nTotal Sales for Each Week:\n");
	    for (int week = 0; week < NUM_WEEKS; week++) {
	        System.out.printf("Week %d: $%.2f\n", week + 1, totalSalesForEachWeek[week]);
	    }
	    System.out.printf("\nAverage Daily Sales for Each Week:\n");
	    for (int week = 0; week < NUM_WEEKS; week++) {
	        System.out.printf("Week %d: $%.2f\n", week + 1, weeklySalesAverages[week]);
	    }
	    System.out.printf("\nTotal Sales for All Weeks: $%.2f\n", totalSales);
	    System.out.printf("\nAverage Weekly Sales: $%.2f\n", averageAllWeeks);
	    System.out.printf("\nWeek with the Highest Amount in Sales: %d\n", topSalesWeek + 1);
	    System.out.printf("\nWeek with the Lowest Amount in Sales: %d\n", lowSalesWeek + 1);
	}

}

