/**
 * Alex Hagemeister
 * Lab 4 Exercise 1
 * CIS 35A
 * Due date: 02-27-2023
 * Date submitted: 02-26-2023
 */

/*
This class represents a savings account with a balance and an interest rate.
    - Uses a static class variable to store annualInterestRate to store the rate for all accounts.
    - Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit.
    - Provides a method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by 
    annualInterestRate divided by 12, and adding this interest to savingsBalance.
    - Provides a static method modifyInterestRate that sets the annualInterestRate to a new value.
*/

// Ensures the SavingsAccount class is part of the "savingsaccount" package and can be accessed by other classes in that package. 
package savingsaccount;

public class SavingsAccount {



    // Class variable to store the annual interest rate for all accounts.
    private static float annualInterestRate;

    // Instance variable to store the balance for each account.
    private float savingsBalance;

    private static final int MONTHS_IN_YEAR = 12;

    // Default constructor.
    public SavingsAccount() {
        this.savingsBalance = 0.0f;
    }

    /**
     * Constructor to initialize the savingsBalance instance variable.
     * @param savingsBalance The initial balance for the account.
     */
    public SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    /**
     * Calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12.
     * This interest is then added to savingsBalance.
     */
    protected void calculateMonthlyInterest() {
        float monthlyInterest = (savingsBalance * getInterestRate()) / MONTHS_IN_YEAR;
        savingsBalance += monthlyInterest;
    }

    // Static method to set the annualInterestRate to a new value.
    protected static void modifyInterestRate(float newInterestRate) {
        annualInterestRate = newInterestRate;
    }
    // Getter method to return the annualInterestRate.
    protected float getInterestRate() {
        return annualInterestRate;
    }
    // Setter method to set the savingsBalance.
    protected void setSavingsBalance(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Getter method to return the savingsBalance.
    protected float getSavingsBalance() {
        return savingsBalance;
    }

    /**
     * Deposit money into the account.
     * @param amount The amount to deposit.
     * @return The new balance.
     */
    protected float deposit(float amount) {
        // Add the amount to the savingsBalance.
        setSavingsBalance(getSavingsBalance() + amount);
        return getSavingsBalance();
    }

    /**
     * Withdraw money from the account.
     * @param amount The amount to withdraw.
     * @return The new balance.
     */
    protected float withdraw(float amount) {
        if (amount <= getSavingsBalance()) {
            setSavingsBalance(getSavingsBalance() - amount);
        } else {
            System.out.printf("INSUFFICIENT FUNDS. You have $%.2f in your account.%n", getSavingsBalance());
        }
        return getSavingsBalance();
    }

    /**
     * Print all the information about the account.
     */
    protected void printAccountInfo() {
        System.out.printf("Account balance: $%.2f %n", getSavingsBalance());
        System.out.printf("Interest rate: %.1f %% %n", getInterestRate() * 100);
    }
}   
