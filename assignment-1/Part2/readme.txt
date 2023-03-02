Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment: -1 (Part 2)
Due: 01/18/2023
Submitted: 01/16/2023

Program Description:
 
	Prompts the user to enter a temperature reading in Centigrade
	and prints the equivalent Fahrenheit value. 
	It then asks the user to enter a Fahrenheit value 
	and prints out the equivalent Centigrade value. 

	Centigrade to Fahrenheit: ˚F = 32 + ˚C (180.0 / 100.0)
	Fahrenheit to Centigrade: ˚C = (100.0/180.0) / (˚F - 32)

Program design:

	variables
		(float) degF to assign with user input and converted values for ˚F
		(float) degC to assign with user input and converted values for ˚C
		
		
	Input
		Use scanner to read temperature to convert.
		Do this within a method that validates user input:
		degC = getValidFloat(scanner, "Enter temperature in ˚C to convert to ˚F: ");
		degF = centigradeToFahrenheit(degC);
	
	
	Processing
		Use methods for conversion:
		public static float centigradeToFahrenheit(float degInC)
		
	
	Printing
		Print the header - 
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","#","Description", "Unit Price", "Total Price");	
		#     Desc     Unit Price     Total Price
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",qtytv,"TV",uptv,tptv);
		2      TV         1000.00          2000.00