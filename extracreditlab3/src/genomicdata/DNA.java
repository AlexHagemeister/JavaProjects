// Alex Hagemeister
// Extra Credit Lab 3 Genomic Data
// CIS 35A
// Due date: 02-27-2023
// Date submitted: 02-27-2023

package genomicdata;

public class DNA {
    /**
     * The DNA class creates two strands of DNA in the helix as arrays of NucleicAcid objects.
     */

    // Arrays to hold NucleicAcid objects
    private NucleicAcid[] LtoRHelix;    // Left to Right Helix
    private NucleicAcid[] RtoLHelix;    // Right to Left Helix 
    private int size;
    
    // Default constructor
    public DNA () {
        this.size = 0;
        this.LtoRHelix = null;
        this.RtoLHelix = null;
    }

	// Overloaded constructor
	public DNA(String strand) {
		this.LtoRHelix = new NucleicAcid[strand.length()];
		this.RtoLHelix = new NucleicAcid[strand.length()];
		LtoRHelixpopulate(strand);
		RtoLHelixpopulate();
        size = strand.length();
	}
    // Getters and setters for the LtoRHelix array
    public NucleicAcid[] getLtoRHelix() { 
        return LtoRHelix; 
    }
    public void setLtoRHelix(NucleicAcid[] ltoRHelix) { 
        LtoRHelix = ltoRHelix; 
    }

    // Getters and setters for the RtoLHelix array
    public NucleicAcid[] getRtoLHelix() { 
        return RtoLHelix; 
    }
    public void setRtoLHelix(NucleicAcid[] rtoLHelix) { 
        RtoLHelix = rtoLHelix; 
    }

    // Getter and setter for the size variable
    public int getSize() { 
        return size; 
    }
    public void setSize(int size) { 
        this.size = size; 
    }

    /**
     * LtoRHelixpopulate() method populates the LtoRHelix array with NucleicAcid objects
     * @param strand (String)
     */
    public void LtoRHelixpopulate(String strand) {

        try {
            if (strand.length() == 0) { // Check if the DNA strand is empty
                throw new Exception("The DNA strand is empty.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        try { // Try parsing the DNA strand into a char array
            char[] nucleicAcids = strand.toCharArray();
            for (int i = 0; i < nucleicAcids.length; i++) { // Iterate through the char array and populate the LtoRHelix array
                switch(nucleicAcids[i]) {
                    case 'A':
                        this.LtoRHelix[i] = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.61f);
                        break;
                    case 'T':
                        this.LtoRHelix[i] = new NucleicAcid("Thymine", "C5H6N2O2", 125.11f, 1.47f);
                        break;
                    case 'C':
                        this.LtoRHelix[i] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.45f);
                        break;
                    case 'G':
                        this.LtoRHelix[i] = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 1.74f);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
	}

    /**
     * RtoLHelixpopulate() method populates the RtoLHelix array with NucleicAcid objects
     * @param strand (String)
     */
    public void RtoLHelixpopulate() {
        try {
            if (this.LtoRHelix.length == 0) { // Check if the DNA strand is empty
                throw new Exception("The DNA strand is empty.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        try { // Try parsing the DNA strand into a char array
            for (int i = 0; i < this.LtoRHelix.length; i++) {
                switch(this.LtoRHelix[i].getName()) {       // Iterate through the LtoRHelix array and populate the RtoLHelix array
                    case "Adenine":
                        this.RtoLHelix[i] = new NucleicAcid("Thymine", "C5H6N2O2", 125.11f, 1.47f);
                        break;
                    case "Thymine":
                        this.RtoLHelix[i] = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.61f);
                        break;
                    case "Cytosine":
                        this.RtoLHelix[i] = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 1.74f);
                        break;
                    case "Guanine":
                        this.RtoLHelix[i] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.45f);
                        break;
                }
            }
        } catch (Exception e) {     // Catch any exceptions
            System.out.println(e.getMessage());
            System.exit(0); // Exit the program
        }
	}
    /**
     * print the index values and highest MolarMass of NucleicAcid objects 
     * after traversing both the LtoRHelix and RtoLHelix arrays
     */
    public void highestMolarMass() {

        float maxLtoRMolarMass = 0;
        int maxLtoRIndex = 0;
        for (int i = 0; i < this.LtoRHelix.length; i++) {
            if (this.LtoRHelix[i].getMolarMass() > maxLtoRMolarMass) {
                maxLtoRMolarMass = this.LtoRHelix[i].getMolarMass();
                maxLtoRIndex = i;
            }
        }
        float maxRtoLMolarMass = 0;
        int maxRtoLIndex = 0;
        for (int i = 0; i < this.RtoLHelix.length; i++) {
            if (this.RtoLHelix[i].getMolarMass() > maxRtoLMolarMass) {
                maxRtoLMolarMass = this.RtoLHelix[i].getMolarMass();
                maxRtoLIndex = i;
            }
        }
        float maxMolarMass = 0;
        int maxIndex = 0;
        if (maxLtoRMolarMass > maxRtoLMolarMass) {
            maxMolarMass = maxLtoRMolarMass;
            maxIndex = maxLtoRIndex;
        } 
        else {
            maxMolarMass = maxRtoLMolarMass;
            maxIndex = maxRtoLIndex;
        }

        // Print the index values and highest MolarMass of NucleicAcid objects
        System.out.printf("Highest Molar Mass: %n");
        System.out.printf("Index: %d %n", maxIndex);
        System.out.printf("Molar Mass: %.2f %n%n", maxMolarMass);
    }
    /**
     * This method prints the total density of all NucleicAcid objects in the LtoRHelix and RtoLHelix arrays 
     */
    public void totalDensity() {
        float totalDensity = 0;
        for (int i = 0; i < this.LtoRHelix.length; i++) {
            totalDensity += this.LtoRHelix[i].getDensity();
        }
        for (int i = 0; i < this.RtoLHelix.length; i++) {
            totalDensity += this.RtoLHelix[i].getDensity();
        }
        // Print the total density
        System.out.printf("Total Density: %.2f %n%n", totalDensity);
    }

    /**
     * print() method prints all class attributes using printf
     */
    public void print() {
        // Print the LtoRHelix array
        System.out.printf("Left to Right Helix: %n");
        for (int i = 0; i < this.LtoRHelix.length; i++) {
            System.out.printf("%s ", this.LtoRHelix[i].getName());
        }
        System.out.printf("%n%n");
        // Print the RtoLHelix array
        System.out.printf("Right to Left Helix: %n");
        for (int i = 0; i < this.RtoLHelix.length; i++) {
            System.out.printf("%s ", this.RtoLHelix[i].getName());
        }
        System.out.printf("%n%n");
        // Print the size variable
        System.out.printf("Size: %d %n%n", this.size);
    }

}
