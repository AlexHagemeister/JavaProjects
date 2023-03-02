/*Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Assignment 3
Due: 2/19/2023
Submitted: 2/19/2023
*/
public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	/**
	 *  iterate over all the stores in the stores array and call their printdata methods
	 *  to print the sales data for each store
	 */
	public void print() {
		
	    for (int i = 0; i < stores.length; i++) {
	    	System.out.printf("\n***** Data from store %d *****\n", i);
	    	stores[i].analyzeresults(); // need to call before printing
	    	stores[i].print();
	    }
	}
}
