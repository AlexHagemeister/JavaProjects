/** 
* Alex Hagemeister
* Lab 4 Exercise 2
* CIS 35A
* Due date: 02-27-2023
* Date submitted: 02-26-2023
* 
* The cargoShip class is a subclass of Ship, and contains additional 
* properties common to cargo ships.
* Overrides the print() method to print the additional properties.
*/

package shipinheritance;

public class CargoShip extends Ship {

    // Additional properties
    private String cargoType;       // the type of cargo the ship carries
    private String loadingMethod;   // the method used to load cargo (Ex: cranes, conveyor belts, etc.)
    private int numberOfCranes;     // the number of cranes on the ship
    private boolean contraband;     // true if the ship carries contraband
    private float cargoValue;       // the value of the cargo in USD

    // Setters and getters for additional properties
    public void setCargoType(String cargoType) { this.cargoType = cargoType; }
    public String getCargoType() { return this.cargoType; }

    public void setLoadingMethod(String loadingMethod) { this.loadingMethod = loadingMethod; }
    public String getLoadingMethod() { return this.loadingMethod; }

    public void setNumberOfCranes(int numberOfCranes) { this.numberOfCranes = numberOfCranes; }
    public int getNumberOfCranes() { return this.numberOfCranes; }

    public void setContraband(boolean contraband) { this.contraband = contraband; }
    public boolean getContraband() { return this.contraband; }

    public void setCargoValue(float cargoValue) { this.cargoValue = cargoValue; }
    public float getCargoValue() { return this.cargoValue; }

    // print() method calls the superclass print() method, then prints the additional properties using printf()
    public void print() {
        super.print();
        System.out.printf("Cargo type: %s %n", getCargoType());
        System.out.printf("Loading method: %s %n", getLoadingMethod());
        System.out.printf("Number of cranes: %d %n", getNumberOfCranes());
        System.out.printf("Contraband: %b %n", getContraband());
        System.out.printf("Cargo value: $%.2f %n", getCargoValue());
    }
}
