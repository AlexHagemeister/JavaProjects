// Alex Hagemeister
// Extra Credit Lab 3 Genomic Data
// CIS 35A
// Due date: 02-27-2023
// Date submitted: 02-27-2023

package genomicdata;

public class DNADriver {
    public static void main(String[] args) {
        /**
         * The DNADriver class contains the main method for the Genomic Data program.
         * It creates an array of 6 DNA objects and tests the methods in the DNA class.
         */

        // Create an array of 5 DNA objects
        DNA[] dnaArray = new DNA[5];
        dnaArray[0] = new DNA("AGCCTAGGATCAG");
        dnaArray[1] = new DNA("AGCCTAGGATCTAGGATCAG");
        dnaArray[2] = new DNA("AGCCTATAGGATCAG");
        dnaArray[3] = new DNA("AAAGCCTAGGATAGGATCAG");
        dnaArray[4] = new DNA("AAAGCCTCTGAGGATAGGATCAG");

        // iterate through the array, calling the print() method on each DNA object
        for (int i = 0; i < dnaArray.length; i++) {
            dnaArray[i].print();
        }
    }
}
