/** 
* Alex Hagemeister
* Lab 4 Exercise 2
* CIS 35A
* Due date: 02-27-2023
* Date submitted: 02-26-2023
* 
* The ShipTestDriver creates a mix of ship types, populates ther data, and inserts them into an array.
* It then calls the print() method for each ship to demonstrate polymorphism.
*/

package shipinheritance;

public class ShipTestDriver {

    public static void main(String[] args) {

        // Number of ships to create
        final int NUM_SHIPS = 3;

        // Create an object of each ship type, populating with data using setters
        Ship ship = new Ship();
        ship.setName("Shippy Ship");
        ship.setFloating(true);
        ship.setCapacity(100);
        ship.setLength(50);
        ship.setWidth(30);
        ship.setHeight(20);
        ship.setOrigin("Shiptopia");
        ship.setDepartureDate("01-01-2020");
        ship.setArrivalDate("01-02-2020");

        CruiseShip cruiseShip = new CruiseShip();
        cruiseShip.setName("Cruisy Cruise");
        cruiseShip.setFloating(true);
        cruiseShip.setCapacity(1000);
        cruiseShip.setLength(300);
        cruiseShip.setWidth(101);
        cruiseShip.setHeight(50);
        cruiseShip.setOrigin("Cruisytown");
        cruiseShip.setDepartureDate("01-01-2022");
        cruiseShip.setArrivalDate("01-22-2022");
        cruiseShip.setTicketPrice(1000);
        cruiseShip.setNumberOfRooms(100);
        cruiseShip.setBuffetMenu("Ham sandwich, Boiled cabbage, Ambrosia, AYCE candy corn");
        String[] services = {"Massage", "Spa", "Haircut", "Shave", "Manicure", "Pedicure"};
        cruiseShip.setServices(services);
        cruiseShip.setCruiseType("Luxury");

        CargoShip cargoShip = new CargoShip();
        cargoShip.setName("Cargo Cargo");
        cargoShip.setFloating(true);
        cargoShip.setCapacity(10000);
        cargoShip.setLength(500);
        cargoShip.setWidth(200);
        cargoShip.setHeight(100);
        cargoShip.setOrigin("Cargotown");
        cargoShip.setDepartureDate("01-01-2023");
        cargoShip.setArrivalDate("01-02-2023");
        cargoShip.setCargoType("Dry");
        cargoShip.setLoadingMethod("Crane");
        cargoShip.setNumberOfCranes(2);
        cargoShip.setContraband(true);
        cargoShip.setCargoValue(121212);

        // Create an array of Ship objects
        Ship[] shipArray = new Ship[NUM_SHIPS];
        // Populate the array with the ship objects
        shipArray[0] = ship;
        shipArray[1] = cruiseShip;
        shipArray[2] = cargoShip;
        
        // Print the data for each ship calling the print() method to demonstrate polymorphism
        for (int i = 0; i < shipArray.length; i++) {
            shipArray[i].print();
            System.out.printf("%n");
        }
    }
}
