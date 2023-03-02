/*Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 3
Due: 2/19/2023
Submitted: 2/19/2023
*/
public class Driver {

	public static void main(String[] args) {
		// Read data into FileIO object
		FileIO a1 = new FileIO("/Users/alexhagemeister/Java/JavaProjects/Assignment3/assignment336b/src/Salesdat.txt");
		// call the FileIO readData method to populate Franchise 
		Franchise f = a1.readData();
		
		// Instantiate UI object
		UI userInterface = new UI();
		
		// Call the UI talkToUser method, passing the Franchise object 
		userInterface.talkToUser(f);
	}

}
