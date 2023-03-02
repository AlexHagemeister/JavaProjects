/**
 * Alex Hagemeister
 * Lab 4 Exercise 1
 * CIS 35A
 * Due date: 02-27-2023
 * Date submitted: 02-26-2023
 */

/*
The SpecialSavings extends SavingsAccount to pay interest of 10% on accounts with balances exceeding 10K. 
Uses methods in both classes to change the interest to 10% if balance is above 10K.

    - Overrides the calculateMonthlyInterest method to pay 10% interest on balances exceeding 10K.
    - Overrides the getInterestRate method to return the interest rate for all accounts based on the savingsBalance.
    - Overrides deposit and withdraw methods to update the overInterestThreshold instance variable if necessary.
    - Overrides the printAccountInfo method to print the account information.
*/

package savingsaccount;

public class SpecialSavings extends SavingsAccount {

    // Instance variable to store the alt interest rate
    private float specialInterestRate;

    // Variable to store the threshold for the alternate interest rate.
    private float specialRateThreshold;

    // Overloaded default constructor initializes new SpecialSavings object with default values.
    public SpecialSavings() {
        // Call the default constructor of the superclass.
        super();
        specialInterestRate = 0.10f;
        specialRateThreshold = 10000.0f;
    }

    /**
     * Overloaded initialization constructor
     * @param savingsBalance The initial balance for the account.
     * @param specialRateThreshold The threshold for the alternate interest rate.
     * @param specialInterestRate The alternate interest rate.
     */
    public SpecialSavings(float savingsBalance, float specialRateThreshold, float specialInterestRate) {
        // Call the constructor of the superclass to initialize the savingsBalance instance variable.
        super(savingsBalance);
        this.specialRateThreshold = specialRateThreshold;
        this.specialInterestRate = specialInterestRate;
    }

    // Overriding getInterestRate method to return the interest rate for all accounts based on the savingsBalance.
    @Override
    protected float getInterestRate() {
        // If the savingsBalance is greater than threshold, return the alternate interest rate.
        if (getSavingsBalance() > specialRateThreshold) {
            return specialInterestRate;
        } 
        // Otherwise, return the default interest rate by calling the superclass method.
        else {
            return super.getInterestRate();
        }
    }
    
    // Setter and getter methods for the specialRateThreshold instance variable.
    protected void modifySpecialRateThreshold(float specialRateThreshold) {
        this.specialRateThreshold = specialRateThreshold;
    }
    protected float getSpecialRateThreshold() {
        return specialRateThreshold;
    }
    // Setter and getter methods for the specialInterestRate instance variable.
    protected void modifySpecialInterestRate(float specialInterestRate) {
        this.specialInterestRate = specialInterestRate;
    }
    protected float getSpecialInterestRate() {
        return specialInterestRate;
    }

    /**
     * Prints the account information by calling the superclass method,
     * then printing the additional SpecialSavings account information.
     */ 
    @Override
    public void printAccountInfo() {
        // Call the superclass method to print the account information.
        super.printAccountInfo();
        // Print additional SpecialSavings account information.
        System.out.printf("Special interest rate threshold: $%.2f %n", specialRateThreshold);
        System.out.printf("Special interest rate: %.1f %% %n", specialInterestRate * 100);
        System.out.printf("Over interest rate threshold: %b %n", (getSavingsBalance() > specialRateThreshold));
        System.out.printf("%n");
    }
}
