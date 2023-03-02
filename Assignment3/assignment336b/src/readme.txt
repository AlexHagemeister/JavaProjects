Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 3
readme.txt: Program design and test output
Due: 2/19/2023
Submitted: 2/19/2023


Program Description:

	Opens and processes a text file containing:
	The dollar amount of sales that a retail store made each day for a number of weeks. 
	Each line in the file contains thirty five numbers, which are sales numbers for five weeks.
	The numbers are separated by space. Each line in the file represents a separate store.
	
 
Program specs:

	The program displays the following per store:
		- The total sales for each week. (5 values - one for each week).
		- The average daily sales for each week. (5 values - one for each week).
		- The total sales for all the weeks. (1 value)
		- The average weekly sales. (1 value)
		- The week with the highest amount in sales. (1 week #)
		- The week with the lowest amount in sales. (1 week #)
	
	Includes a user-friendly interface (Console based) in a separate class called UI.java

	
Program design:

	Classes: 
	
		- Franchise: represents the franchise as a whole, with an array of Store objects
		- FileIO: handles reading sales data from a file and creating Franchise and Store objects based on that data 
		- Store: represents a single store in the franchise. It has a 2D array of floating point numbers called salesbyweek
		- Driver: creates a new FileIO object, reads the sales data from the file and creates a Franchise object
		- UI: User interface, instantiated by Driver class

	Relationships between classes:
	
		- Franchise:Store = containment: The Franchise class contains an array of Store objects representing the individual stores in the franchise
		- FileIO:Franchise = containment: The FileIO class creates instances of the Franchise class and reads sales data into them
		- FileIO:Store = containment: The FileIO class creates instances of the Store class and populates them with sales data.
		- Driver:FileIO = dependency: The Driver class depends on the FileIO class to read and process sales data.
		- Store:Franchise = dependency: The Store class depends on the Franchise class to represent the franchise to which it belongs.
		- Franchise:Store[] = encapsulation: The Franchise class encapsulates an array of Store objects representing the stores in the franchise.

	Input:
	
		- reads data from Salesdat.txt
		- Gets user selection in UI.java, validates with try-catch

	Processing:
	
		- for reading data: parsed in FileIO class
		- computing menu items: internal to Store class

	Printing:
	
		- Each class has a print() method that uses printf
		- displays data using methods in the Store class and the UI class
	
	
***** PROGRAM OUTPUT *****

Welcome to the Franchise App! 
We have data for 6 stores for the last 5 weeks.

Select a store # you want to see analytics for (-1 to quit): 100
Invalid store number. Please try again.

Select a store # you want to see analytics for (-1 to quit): 10
Invalid store number. Please try again.

Select a store # you want to see analytics for (-1 to quit): -10
Invalid store number. Please try again.

Select a store # you want to see analytics for (-1 to quit): 0
Invalid store number. Please try again.

Select a store # you want to see analytics for (-1 to quit): asd
Invalid input. Please enter a valid store number.

Select a store # you want to see analytics for (-1 to quit): 1
Your selected: store #1 

1. Enter 1 for total sales for each week 
2. Enter 2 for average daily sales for each week 
3. Enter 3 for total sales for all weeks 
4. Enter 4 for average weekly sales 
5. Enter 5 for week with the highest amount in sales 
6. Enter 6 for week with the lowest amount in sales 
7. Enter 7 for all analytical data 

Select an operation: 7

Total Sales for Each Week:
Week 1: $17790.92
Week 2: $19397.00
Week 3: $24269.00
Week 4: $29141.00
Week 5: $34013.00

Average Daily Sales for Each Week:
Week 1: $2541.56
Week 2: $2771.00
Week 3: $3467.00
Week 4: $4163.00
Week 5: $4859.00

Total Sales for All Weeks: $124610.92

Average Weekly Sales: $24922.18

Week with the Highest Amount in Sales: 5

Week with the Lowest Amount in Sales: 1

Select a store # you want to see analytics for (-1 to quit): 6
Your selected: store #6 

1. Enter 1 for total sales for each week 
2. Enter 2 for average daily sales for each week 
3. Enter 3 for total sales for all weeks 
4. Enter 4 for average weekly sales 
5. Enter 5 for week with the highest amount in sales 
6. Enter 6 for week with the lowest amount in sales 
7. Enter 7 for all analytical data 

Select an operation: 7

Total Sales for Each Week:
Week 1: $28283.85
Week 2: $29889.93
Week 3: $34761.93
Week 4: $39633.93
Week 5: $44505.93

Average Daily Sales for Each Week:
Week 1: $4040.55
Week 2: $4269.99
Week 3: $4965.99
Week 4: $5661.99
Week 5: $6357.99

Total Sales for All Weeks: $177075.56

Average Weekly Sales: $35415.11

Week with the Highest Amount in Sales: 5

Week with the Lowest Amount in Sales: 1

Select a store # you want to see analytics for (-1 to quit): -1

Your selection: -1 to quit. Goodbye. 