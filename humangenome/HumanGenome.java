/**
 * Name: Alex Hagemeister
 * Course.Section: CIS D035A.63Z
 * Assignment 2 pt 1: Human Genome Lab
 * File: HumanGenome.java
 * Due: 2/12/2023
 */
public class HumanGenome {
	/**
	 * The HumanGenome class defines the blueprint for creating objects that represent a human genome.
	 * Contains all appropriate properties, getters & setters, and a print method.
	 */
	private String genomeName;
	private int numGenes;
	private int numChromosomes;
	private int numCells;
	
	// Default constructor
	public HumanGenome() {
		this.genomeName = "Uninitialized";
		this.numGenes = 0;
		this.numChromosomes = 0;
		this.numCells = 0;
	}

	// Overloaded initialization constructor
	public HumanGenome(String genomeName, int numGenes, int numChromosomes, int numCells) {
		this.genomeName = genomeName;
		this.numGenes = numGenes;
		this.numChromosomes = numChromosomes;
		this.numCells = numCells;
	}
	// Getter method for the genomeName variable
	public String getGenomeName() {
		return genomeName;
	}
	// Setter method for the genomeName variable
	public void setGenomeName(String genomeName) {
		this.genomeName = genomeName;
	}
	// Getter method for the numGenes variable
	public int getNumGenes() {
		return numGenes;
	}
	// Setter method for the numGenes variable
	public void setNumGenes(int numGenes) {
		this.numGenes = numGenes;
	}
	// Getter method for the numChromosomes variable
	public int getNumChromosomes() {
		return numChromosomes;
	}
	// Setter method for the numChromosomes variable
	public void setNumChromosomes(int numChromosomes) {
		this.numChromosomes = numChromosomes;
	}
	// Getter method for the numCells variable
	public int getNumCells() {
		return numCells;
	}
	// Setter method for the numCells variable
	public void setNumCells(int numCells) {
		this.numCells = numCells;
	}
	// Print method displays properties as value-name pairs using 'printf'
	// Formatting arguments: %s, %d specify type to format, %n adds a newline
	public void print() {
		System.out.printf("Genome Name: %s%n", genomeName);
		System.out.printf("Number of Genes: %d%n", numGenes);
		System.out.printf("Number of Chromosomes: %d%n", numChromosomes);
		System.out.printf("Number of Cells (x10e12): %d%n", numCells);
		System.out.printf("%n");
	}
}

