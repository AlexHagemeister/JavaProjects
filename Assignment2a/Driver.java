/**
 * @file Driver.java
 * @author Alex Hagemeister
 * @Course.Section: CIS D035A.63Z
 * @Assignment 2a: Personal Information Class
 * @Due: Mon, 6 Feb 2023 23:59
 * @submitted: 02/04/2023
 */

import java.util.Scanner;

public class Driver {
	
	/**
	 * The Driver class creates three instances of the Person class, 
	 * populates their information using a method called readValue,
	 * and prints their information using the print method of the Person class. 
	 */
	
    // Scanner object to read input
	// Declared as static so it can be shared among all instances of the Driver class,
	// which reduces amount of memory required by the program.
	static Scanner s1 = new Scanner(System.in);
	
	public static void main(String [] args) {
	    Driver d1 = new Driver();
	    // create three instances of the Person class and populate their information
	    Person Stacey = d1.readValue();
	    Stacey.print();
	    Person Ross = d1.readValue();
	    Ross.print();
	    Person Mia = d1.readValue();
	    Mia.print();
	}
    
	/**
	 * Method to read input for the Person class using the Scanner object
	 * @return (Person) a new instance of the Person class with the input values
	 */
	public Person readValue() {
	    System.out.print("Enter name: ");
	    String name = s1.nextLine();
	    System.out.print("Enter address: ");
	    String address = s1.nextLine();
	    System.out.print("Enter age: ");
	    int age = s1.nextInt();
	    s1.nextLine();
	    System.out.print("Enter phone number: ");
	    String phoneNo = s1.nextLine();
	    
	    // create and return a new instance of the Person class with the input values
	    return new Person(name, address, age, phoneNo);
	}
}