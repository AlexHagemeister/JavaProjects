/** 
* Alex Hagemeister
* Lab 4 Exercise 2
* CIS 35A
* Due date: 02-27-2023
* Date submitted: 02-26-2023
* 
* The cruiseShip class is a subclass of Ship, and contains additional 
* properties common to cruise ships.
* Overrides the print() method to print the additional properties.
*/

package shipinheritance;

public class CruiseShip extends Ship {
    
    // Additional properties
    private float ticketPrice;  // the price of a ticket on the ship
    private int numberOfRooms;  // the number of rooms on the ship
    private String buffetMenu;  // the buffet menu on the ship
    private String[] services;  // the services offered on the ship
    private String cruiseType;  // the type of cruise the ship

    // Setters and getters for additional properties
    public void setTicketPrice(float ticketPrice) { this.ticketPrice = ticketPrice; }
    public float getTicketPrice() { return this.ticketPrice; }

    public void setNumberOfRooms(int numberOfRooms) { this.numberOfRooms = numberOfRooms; }
    public int getNumberOfRooms() { return this.numberOfRooms; }

    public void setBuffetMenu(String buffetMenu) { this.buffetMenu = buffetMenu; }
    public String getBuffetMenu() { return this.buffetMenu; }

    public void setServices(String[] services) { this.services = services; }
    public String[] getServices() { return this.services; }

    public void setCruiseType(String cruiseType) { this.cruiseType = cruiseType; }
    public String getCruiseType() { return this.cruiseType; }

    // print() method calls the superclass print() method, 
    // then prints the additional properties using printf()
    public void print() {
        super.print();
        System.out.printf("Ticket price: $%.2f %n", getTicketPrice());
        System.out.printf("Number of rooms: %d %n", getNumberOfRooms());
        System.out.printf("Buffet menu: %s %n", getBuffetMenu());
        System.out.printf("Cruise type: %s %n", getCruiseType());
        // Print the services array
        System.out.printf("Services: %n");
        for (int i = 0; i < services.length; i++) {
            System.out.printf("\t%s %n", services[i]);
        }   
    }
}
