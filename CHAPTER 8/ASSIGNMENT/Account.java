
package Chapter_8.Assignment;

import java.math.BigDecimal;
public class Account {
    private final String accountNumber; // Account number
    private BigDecimal balance;    // Account balance

    // Constructor
    public Account(String accountNumber, BigDecimal initialBalance) {
        this.accountNumber = accountNumber;
        // Initialize balance with BigDecimal
        this.balance = initialBalance.compareTo(BigDecimal.ZERO) < 0 ? BigDecimal.ZERO : initialBalance;
    }

    // Method to deposit money
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount); // Add amount to balance
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(balance) <= 0) {
            balance = balance.subtract(amount); // Subtract amount from balance
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }

    // Method to get the account balance
    public BigDecimal getBalance() {
        return balance; // Return the current balance
    }

    // Method to get the account number
    public String getAccountNumber() {
        return accountNumber; // Return the account number
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


