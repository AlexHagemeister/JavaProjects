/**
 * @file Person.java
 * @author Alex Hagemeister
 * @Course.Section: CIS D035A.63Z
 * @Assignment 2a: Personal Information Class
 * @Due: Mon, 6 Feb 2023 23:59
 * @submitted: 02/04/2023
 * 
 * @desciption: 
 * 
 * 	This program is a demonstration of a class that holds personal data, called Person.
 *	It has instance variables for name, address, age, and phone number, 
 *	and has methods for getting and setting these values. 
 *	Has a print method that outputs the values of the instance variables.
 *
 * 	Notes: 
 * 		
 * 		In the code, "this." is a reference to the current instance of the class. 
 * 		The "this" keyword is used to distinguish between the instance variables 
 * 		and the local variables with the same name in the constructor. 
 * 		Without the use of "this", the code would try to create local variables with the same name 
 * 		as the instance variables, which would result in a compile-time error. 
 * 		By using this, we ensure that we are referring to the instance variables 
 * 		and not to local variables with the same name.
 */

public class Person {
	
    
    // Instance variables to store the name, address, age, and phone number of a person
    // Declaring these as private insures they may only be accessed through class methods. 
    private String name;
    private String address;
    private int age;
    private String phoneNo;
    
    // Default constructor that initializes the instance variables with default values
    // when Person object is created without passing any parameters
    public Person() {
        this.name = "";
        this.address = "";
        this.age = 0;
        this.phoneNo = "";
    }
    
    // Initialization constructor that accepts input for all four instance variables
    public Person(String name, String address, int age, String phoneNo) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNo = phoneNo;
    }
    
    // getter and setter methods for each instance variable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    // method to print the values of the instance variables
    public void print() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Address: %s\n", address);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Phone No.: %s\n\n", phoneNo);
    }
}