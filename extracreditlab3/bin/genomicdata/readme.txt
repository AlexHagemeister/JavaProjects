Alex Hagemeister
Extra Credit Lab 3 Genomic Data
CIS 35A
Due date: 02-27-2023
Date submitted: 02-27-2023

*** PROGRAM DESIGN AND OUTPUT ***

HumanGenome class:

    Defines the blueprint for creating objects that represent a human genome.

    Variables:
        - genomeName (String)
        - numGenes (int)
        - numChromosomes (int)
        - numCells (int)

    Processing: 
        + HumanGenome(): default constructor
        + HumanGenome(String, int, int, int): overloaded constructor
        + Setters and getters for all variables
        + print(): prints all attributes of the object

    Printing:
        + print(): prints formatted attributes of the object using printf

NucleicAcid class:

    Defines the blueprint for creating objects that represent a nucleic acid.

    Variables:
        - name (String): name of the nucleic acid
        - chemicalFormula (String): chemical formula of the nucleic acid
        - molarMass (float): molar mass of the nucleic acid
        - density (float): density of the nucleic acid

    Processing: 
        + NucleicAcid(): default constructor
        + NucleicAcid(String, String, float, float): overloaded constructor
        + Setters and getters for all variables
        + print(): prints all attributes of the object

    Printing:

DNADriver class:

    Tests the DNA class by creating 5 DNA objects and printing their attributes by calling their print methods.

*** PROGRAM OUTPUT ***

Left to Right Helix: 
Adenine Guanine Cytosine Cytosine Thymine Adenine Guanine Guanine Adenine Thymine Cytosine Adenine Guanine 

Right to Left Helix: 
Thymine Cytosine Guanine Guanine Adenine Thymine Cytosine Cytosine Thymine Adenine Guanine Thymine Cytosine 

Size: 13 

Left to Right Helix: 
Adenine Guanine Cytosine Cytosine Thymine Adenine Guanine Guanine Adenine Thymine Cytosine Thymine Adenine Guanine Guanine Adenine Thymine Cytosine Adenine Guanine 

Right to Left Helix: 
Thymine Cytosine Guanine Guanine Adenine Thymine Cytosine Cytosine Thymine Adenine Guanine Adenine Thymine Cytosine Cytosine Thymine Adenine Guanine Thymine Cytosine 

Size: 20 

Left to Right Helix: 
Adenine Guanine Cytosine Cytosine Thymine Adenine Thymine Adenine Guanine Guanine Adenine Thymine Cytosine Adenine Guanine 

Right to Left Helix: 
Thymine Cytosine Guanine Guanine Adenine Thymine Adenine Thymine Cytosine Cytosine Thymine Adenine Guanine Thymine Cytosine 

Size: 15 

Left to Right Helix: 
Adenine Adenine Adenine Guanine Cytosine Cytosine Thymine Adenine Guanine Guanine Adenine Thymine Adenine Guanine Guanine Adenine Thymine Cytosine Adenine Guanine 

Right to Left Helix: 
Thymine Thymine Thymine Cytosine Guanine Guanine Adenine Thymine Cytosine Cytosine Thymine Adenine Thymine Cytosine Cytosine Thymine Adenine Guanine Thymine Cytosine 

Size: 20 

Left to Right Helix: 
Adenine Adenine Adenine Guanine Cytosine Cytosine Thymine Cytosine Thymine Guanine Adenine Guanine Guanine Adenine Thymine Adenine Guanine Guanine Adenine Thymine Cytosine Adenine Guanine 

Right to Left Helix: 
Thymine Thymine Thymine Cytosine Guanine Guanine Adenine Guanine Adenine Cytosine Thymine Cytosine Cytosine Thymine Adenine Thymine Cytosine Cytosine Thymine Adenine Guanine Thymine Cytosine 

Size: 23 