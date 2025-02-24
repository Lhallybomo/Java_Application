
package Chapter_8.Assignment;


public class SavingsAccount {
    // Static variable to store the annual interest rate
    private static double annualInterestRate;

    
    // Instance variable to store the savings balance
    private double savingsBalance;

    
    // Constructor to initialize the savings balance
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    
    // Method to calculate monthly interest and update the savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    
    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    
    // Method to get the current balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

