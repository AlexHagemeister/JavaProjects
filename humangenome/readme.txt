oName: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 2 pt1: Human Genome Lab
readme.txt: Program design and test output
Due: 2/12/2023
Submitted: 

Program Description:

	This program applies principles of Object Oriented Programming to read, store and print
	data representing individual genetic profiles.
 

Program specs:

	The HumanGenome Class holds information about a person's genome, such as
		
		- genome name (name of subject)
		- number of genes
		- number of chromosomes
		- number of cells in their body
		- a constructor
		- getters and setters
		- a print method to print the properties of the class
	
	The GenomeInput class 
	
		Has an input method which uses a scanner to read input, 
		and returns a HumanGenome instance.
		
		Has a main method which calls the input method 3 times 
		to create three instances of HumanGenome and prints their info.
		
	
Program design:

	Variables:
	
		HumanGenome
		
			- genomeName (String)
			- numGenes (int)
			- numChromosomes (int)
			- numCells (int)
			
		GenomeInput
		
			- NUM_GENOMES (final static int)
		
	Input:
	
		- GenomeInput uses a loop to repeatedly call the input() method
		- Input() reads input using a scanner, and validates input using a try-catch block

	Processing:
	
		- No processing necessary, aside from input validation and print formatting
		- HumanGenome objects are stored in an array, with a length specified by a constant

	Printing:
	
		- All output is printed using printf() and the appropriate format specifiers
		- The Driver uses a loop in a print method to iterate through the array of HumanGenome objects, 
		calling each of their print() methods
		
	
	***** PROGRAM OUTPUT *****


	Output #1: expected input
	
		Enter Genome Name: Mickey Mouse
		Enter Number of Genes: 20000
		Enter Number of Chromosomes: 46
		Enter Number of Cells (x10e12): 10
		
		Enter Genome Name: Timon
		Enter Number of Genes: 21000
		Enter Number of Chromosomes: 46
		Enter Number of Cells (x10e12): 12
		
		Enter Genome Name: Pumbaa
		Enter Number of Genes: 21200
		Enter Number of Chromosomes: 45
		Enter Number of Cells (x10e12): 13
		
		** Printing genome data ** 
		
		Genome Name: Mickey Mouse
		Number of Genes: 20000
		Number of Chromosomes: 46
		Number of Cells (x10e12): 10
		
		Genome Name: Timon
		Number of Genes: 21000
		Number of Chromosomes: 46
		Number of Cells (x10e12): 12
		
		Genome Name: Pumbaa
		Number of Genes: 21200
		Number of Chromosomes: 45
		Number of Cells (x10e12): 13
		
		
	Output #2: String input when int expected
	
		Enter Genome Name: Mickey Mouse
		Enter Number of Genes: twenty thousand
		Invalid entry, try again: 20000
		Enter Number of Chromosomes: forty six
		Invalid entry, try again: 46
		Enter Number of Cells (x10e12): 10
		
		Enter Genome Name: Timon
		Enter Number of Genes: 21000
		Enter Number of Chromosomes: 46
		Enter Number of Cells (x10e12): 12
		
		Enter Genome Name: Pumbaa
		Enter Number of Genes: 21200
		Enter Number of Chromosomes: 45
		Enter Number of Cells (x10e12): thirteen
		Invalid entry, try again: 13
		
		** Printing genome data ** 
		
		Genome Name: Mickey Mouse
		Number of Genes: 20000
		Number of Chromosomes: 46
		Number of Cells (x10e12): 10
		
		Genome Name: Timon
		Number of Genes: 21000
		Number of Chromosomes: 46
		Number of Cells (x10e12): 12
		
		Genome Name: Pumbaa
		Number of Genes: 21200
		Number of Chromosomes: 45
		Number of Cells (x10e12): 13
	
	
	Output #3: Negative entries
	
		Enter Genome Name: Mickey Mouse
		Enter Number of Genes: -20000
		Invalid entry, try again: 20000
		Enter Number of Chromosomes: -46
		Invalid entry, try again: 46
		Enter Number of Cells (x10e12): -10
		Invalid entry, try again: 10
		
		Enter Genome Name: Timon
		Enter Number of Genes: 21000
		Enter Number of Chromosomes: 46
		Enter Number of Cells (x10e12): -12
		Invalid entry, try again: 12
		
		Enter Genome Name: Pumbaa
		Enter Number of Genes: -21200
		Invalid entry, try again: 21200
		Enter Number of Chromosomes: 45
		Enter Number of Cells (x10e12): -12
		Invalid entry, try again: 12
		
		** Printing genome data ** 
		
		Genome Name: Mickey Mouse
		Number of Genes: 20000
		Number of Chromosomes: 46
		Number of Cells (x10e12): 10
		
		Genome Name: Timon
		Number of Genes: 21000
		Number of Chromosomes: 46
		Number of Cells (x10e12): 12
		
		Genome Name: Pumbaa
		Number of Genes: 21200
		Number of Chromosomes: 45
		Number of Cells (x10e12): 12
	
