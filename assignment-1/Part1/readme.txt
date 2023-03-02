Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment: -1 (part 1)
Due: 01/18/2023
Submitted: 01/16/2023

Program Description: 
	Creates a customer's bill for a company selling 5 products. 
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
	
Program design (as discussed in lecture):

	variables
		(int) we need variables to track qty - qtytv qtyps5 qtywin
		(float) variables for unit price  uptv, upps5, upwin
			final float uptv = 1000.00f;
		(float) variables for totalprice - tptv, tvps5 tpwin
		(float) variables for total, tax and grandtotal - total, tax, gtotal.
	Input
		Use scanner to read the qty of tv, ps4 and windows bought.
		System.out.printf("Enter # of TV bought");
		qtytv = s1.readInt();
	
	
	Processing
		calculate total price for tv, ps5 and windows
		tptv = uptv * qtytv;
	  	..
		compute total
		compute tax at 10%
		compute total
	
	Printing
		Print the header - 
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","#","Description", "Unit Price", "Total Price");	
		#     Desc     Unit Price     Total Price
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",qtytv,"TV",uptv,tptv);
		2      TV         1000.00          2000.00