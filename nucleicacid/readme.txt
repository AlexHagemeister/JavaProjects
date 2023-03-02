Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 2 pt2: Nucleic Acid
readme.txt: Program design and test output
Due: 2/12/2023
Submitted: 2/12/2023

Program Description:

	This program uses OOP principles to store and print nucleic acid information entered by the user. 
	The design consists of two classes:
		• NucleicAcid, which stores nucleic acid information 
		• GeoNucleicAcid, which instantiates NucleicAcid objects and populates them with user input
 
Program specs:

	• All classes are public
	• includes default constructor
	• private instance variables
	• all methods are private or protected
	• uses printf() for printing

Program design:

	Variables:
		
			- name (string): name of nucleic acid (ex. Cytosine, Adenine, Guanine, etc.)
			- chemicalFormula (string)
			- molarMass (float)
			- density (float)
			+ Getters/setters

	Input:
	
		+ GenoNucleicAcid uses an input() method called in its driver (main) method 
		to populate NucleicAcid objects with data.
		* Numeric input is validated in a separate validation method, called in input()

	Processing:
	
		The driver method uses a loop to populate an array with NucleicAcid objects

	Printing:
	
		+ Nucleic acid has a public print() method which uses printf() to print formatted attributes
		* The driver method uses a loop to iterate through the array calling the print() method
		
	
	***** PROGRAM OUTPUT *****

Enter name of nucleic acid: Cytosine
Enter chemical formula: C4H5N3O
Enter molar mass (g/mol): 111.10
Enter Density (g/cm^3): 1.55

Enter name of nucleic acid: Adenine
Enter chemical formula: C4H5N3O
Enter molar mass (g/mol): 111.10.10		// INVALID ENTRY
Invalid entry, try again: 111.10
Enter Density (g/cm^3): -1.6			// INVALID ENTRY
Invalid entry, try again: 1.6

Enter name of nucleic acid: Guanine
Enter chemical formula: C5H5N5O
Enter molar mass (g/mol): 151.13
Enter Density (g/cm^3): 1.6

Enter name of nucleic acid: Thymine
Enter chemical formula: C5H6N2O2
Enter molar mass (g/mol): 126.115
Enter Density (g/cm^3): 1.223

Enter name of nucleic acid: Uracil
Enter chemical formula: C4H4N2O2
Enter molar mass (g/mol): 112.08676
Enter Density (g/cm^3): 1.32

Nucleic acid: Cytosine 
Chemical formula: C4H5N3O 
Molar mass: 111.10000 g/mol 
Density: 1.55000 g/cm^3 

Nucleic acid: Adenine
Chemical formula: C4H5N3O
Molar mass: 111.10000 g/mol 
Density: 1.60000 g/cm^3 

Nucleic acid: Guanine
Chemical formula: C5H5N5O
Molar mass: 151.13000 g/mol 
Density: 1.6000 g/cm^3 

Nucleic acid: Thymine
Chemical formula: C5H6N2O2
Molar mass: 126.11500 g/mol 
Density: 1.22300 g/cm^3 

Nucleic acid: Uracil
Chemical formula: C4H4N2O2
Molar mass: 112.08676 g/mol 
Density: 1.32000 g/cm^3 



	