/** 
* Alex Hagemeister
* Lab 4 Exercise 2
* CIS 35A
* Due date: 02-27-2023
* Date submitted: 02-26-2023
* 
* The Ship class is a superclass for CruiseShip and CargoShip. It contains
* properties common to all ships.
*/

package shipinheritance;

public class Ship {

    private String name;            // the ship's name
    private boolean floating;       // true if the ship is floating
    private int capacity;           // the ship's capacity in tons
    private int length;             // the ship's length in feet
    private int width;              // the ship's width in feet
    private int height;             // the ship's height in feet
    private String origin;          // the ship's country of origin
    private String departureDate;   // the ship's departure date
    private String arrivalDate;     // the ship's arrival date

    // Default constructor
    public Ship() {
        floating = false;
        capacity = length = width = height = 0;
        name = "";
        origin = "";
        departureDate = "";
        arrivalDate = "";
    }

    /**
     * @NOTE: too many parameters for initialization constructor.
     * @USE setters instead.
     */

    // Getters and setters
    public void setFloating(boolean floating) { this.floating = floating; }
    public boolean getFloating() { return this.floating; }

    public void setCapacity(int capacity) { this.capacity = capacity; }
    public int getCapacity() { return this.capacity; }

    public void setLength(int length) { this.length = length; }
    public int getLength() { return this.length; }

    public void setWidth(int width) { this.width = width; }
    public int getWidth() { return this.width; }

    public void setHeight(int height) { this.height = height; }
    public int getHeight() { return this.height; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setOrigin(String origin) { this.origin = origin; }
    public String getOrigin() { return this.origin; }

    public void setDepartureDate(String departureDate) { this.departureDate = departureDate; }
    public String getDepartureDate() { return this.departureDate; }

    public void setArrivalDate(String arrivalDate) { this.arrivalDate = arrivalDate; }
    public String getArrivalDate() { return this.arrivalDate; }
    
    // print() method prints all ship properties with labels using printf()
    public void print() {
        System.out.printf("Name: %s %n", getName());
        System.out.printf("Origin: %s %n", getOrigin());
        System.out.printf("Floating: %b %n", getFloating());
        System.out.printf("Capacity: %d tons %n", getCapacity());
        System.out.printf("Length: %d feet %n", getLength());
        System.out.printf("Width: %d feet %n", getWidth());
        System.out.printf("Height: %d feet %n", getHeight());
        System.out.printf("Departure date: %s %n", getDepartureDate());
        System.out.printf("Arrival date: %s %n", getArrivalDate());
    }
}
