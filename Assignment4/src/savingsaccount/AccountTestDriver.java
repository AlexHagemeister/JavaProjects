/** 
* Alex Hagemeister
* Lab 4 Exercise 1
* CIS 35A
* Due date: 02-27-2023
* Date submitted: 02-26-2023
* 
* The AccountTestDriver class is used to test the SavingsAccount and SpecialSavings classes.
*/

package savingsaccount;

public class AccountTestDriver {

    public static void main(String[] args) {

        System.out.printf("%n |-----------------------------------------------|");
        System.out.printf("%n |      PART 1: Testing SavingsAccount Class     |");
        System.out.printf("%n |-----------------------------------------------| %n");
        /*
        PART 1:
        Create two SavingsAccount objects, set the annual interest rate to 4%,
        calculates the monthly interest for each of the two objects, and displays
        the new balances for each of the objects.
        It then sets the annual interest rate to 5%, calculates the next month's
        interest, and then displays the new balances for each of the objects.
        */

        // Create two SavingsAccount objects.
        SavingsAccount saver1 = new SavingsAccount(2000.00f);
        SavingsAccount saver2 = new SavingsAccount(3000.00f);
        System.out.printf("%n--> Saver objects created.%n");

        // Set the annual interest rate to 4%.
        SavingsAccount.modifyInterestRate(0.04f);
        System.out.printf("--> Annual interest rate set to 4%%.%n");

        // Calculate the monthly interest for each of the two objects.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Create a message to display when balances are updated.
        String balancesUpdatedMessage = "%n** BALANCES UPDATED. Printing new account info **%n%n";

        // Display new account info.
        System.out.printf(balancesUpdatedMessage);
        System.out.printf("saver1: %n");
        saver1.printAccountInfo();
        System.out.printf("saver2: %n");
        saver2.printAccountInfo();

        // Set the annual interest rate to 5%.
        SavingsAccount.modifyInterestRate(0.05f);
        System.out.printf("%n--> Annual interest rate set to 5%%.%n");

        // Calculate the monthly interest for each of the two objects.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Display new account info.
        System.out.printf(balancesUpdatedMessage);
        System.out.printf("saver1: %n");
        saver1.printAccountInfo();
        System.out.printf("saver2: %n");
        saver2.printAccountInfo();

        // END PART 1
        System.out.printf("%n|-----------------------------------------------|");
        System.out.printf("%n|                    END PART 1                 |");
        System.out.printf("%n|-----------------------------------------------| %n");
        System.out.printf("%n|-----------------------------------------------|");
        System.out.printf("%n|  START PART 2: Testing SpecialSavings class   |");
        System.out.printf("%n|-----------------------------------------------|%n");


        /**
         * PART 2: repeat this process for the SpecialSavings class, 
         * and test the functionality of all overridden methods.
         */

        // Create constants for the threshold and alternate interest rate.
        final float RATE_THRESHOLD = 10000.00f;
        final float OVER_THRESHOLD_INTEREST_RATE = 0.10f;

        // Create two SpecialSavings objects.
        SpecialSavings saver3 = new SpecialSavings(2000.00f, RATE_THRESHOLD, OVER_THRESHOLD_INTEREST_RATE);
        SpecialSavings saver4 = new SpecialSavings(3000.00f, RATE_THRESHOLD, OVER_THRESHOLD_INTEREST_RATE);
        System.out.printf("%n--> SpecialSavings objects created.%n");

        // Set the annual interest rate to 5%.
        SpecialSavings.modifyInterestRate(0.05f);
        System.out.printf("%n--> Annual interest rate set to 5%%.%n");

        // Calculate the monthly interest for each of the two objects.
        saver3.calculateMonthlyInterest();
        saver4.calculateMonthlyInterest();

        // Display new account info..
        System.out.printf(balancesUpdatedMessage);
        System.out.printf("saver3: %n");
        saver3.printAccountInfo();
        System.out.printf("saver4: %n");
        saver4.printAccountInfo();

        // Test the deposit methods, increasing the balance of each over the interest hike threshold.
        saver3.deposit(10000.00f);
        saver4.deposit(10000.00f);
        System.out.printf("%n--> Deposited $10,000 into each account.%n");

        // Display new account info..
        System.out.printf(balancesUpdatedMessage);
        System.out.printf("saver3: %n");
        saver3.printAccountInfo();
        System.out.printf("saver4: %n");
        saver4.printAccountInfo();

        // Test the withdraw methods, decreasing the balance of each under the interest hike threshold.
        saver3.withdraw(12000.00f);
        saver4.withdraw(12000.00f);
        System.out.printf("%n--> Withdrew $12,000 from each account.%n");

        // Display new account info..
        System.out.printf(balancesUpdatedMessage);
        System.out.printf("saver3: %n");
        saver3.printAccountInfo();
        System.out.printf("saver4: %n");
        saver4.printAccountInfo();

        // Attempt to withdraw more than the balance of each account.
        System.out.printf("%n--> Attempting to withdraw $2,000 from each account:%n");
        saver3.withdraw(2000.00f);
        saver4.withdraw(2000.00f);

        // Modify the specialInterestRate and specialRateThreshold for each account.
        System.out.printf("%n--> Modifying specialInterestRate and specialRateThreshold for each account:%n");
        saver3.modifySpecialInterestRate(0.08f);
        saver3.modifySpecialRateThreshold(12000.00f);
        saver4.modifySpecialInterestRate(0.08f);
        saver4.modifySpecialRateThreshold(12000.00f);

        // Deposit $11,000 into each account.
        System.out.printf("%n--> Depositing $11,000 into each account:%n");
        saver3.deposit(11000.00f);
        saver4.deposit(11000.00f);

        // Display new account info..
        System.out.printf(balancesUpdatedMessage);
        System.out.printf("saver3: %n");
        saver3.printAccountInfo();
        System.out.printf("saver4: %n");
        saver4.printAccountInfo();

        System.out.printf("%n|-----------------------------------------------|");
        System.out.printf("%n|                    END PART 2                 |");
        System.out.printf("%n|-----------------------------------------------| %n");
    }
}
