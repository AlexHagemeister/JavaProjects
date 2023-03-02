// Alex Hagemeister
// Extra Credit Lab 3 Genomic Data
// CIS 35A
// Due date: 02-27-2023
// Date submitted: 02-27-2023


package genomicdata;

public class NucleicAcid {
    /**
     * The NucleicAcid class defines the blueprint for creating objects that represent a nucleic acid.
     */

    private String name;
	private String chemicalFormula;
	private float molarMass;
	private float density;
		
	// Default constructor
	public NucleicAcid() {
		this.name = "Name uninitialized";
		this.chemicalFormula = "CF Uninitialized";
		this.molarMass = 0.0f;
		this.density = 0.0f;
	}	
	// Initialization constructor
	public NucleicAcid(String name, String chemicalFormula, float molarMass, float density) {
		this.name = name;
		this.chemicalFormula = chemicalFormula;
		this.molarMass = molarMass;
		this.density = density;
	}
	// GETTERS
	public String getName() {
		return name;
	}
	public String getChemicalFormula() {
		return chemicalFormula;
	}
	public float getMolarMass() {
		return molarMass;
	}
	public float getDensity() {
		return density;
	}
	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	public void setMolarMass(float molarMass) {
		this.molarMass = molarMass;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	// PRINT
	public void print() {
		System.out.printf("Nucleic acid: %s %n", name);
		System.out.printf("Chemical formula: %s %n", chemicalFormula);
		System.out.printf("Molar mass: %.5f g/mol %n", molarMass);
		System.out.printf("Density: %.5f g/cm^3 %n", density);
		System.out.printf("%n");
    }
}
