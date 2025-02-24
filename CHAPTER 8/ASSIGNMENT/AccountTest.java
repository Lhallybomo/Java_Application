
package Chapter_8.Assignment;

import java.math.BigDecimal;
public class AccountTest {
     public static void main(String[] args) {
        // Create an account with an initial balance
        Account account = new Account("123456789", new BigDecimal("1000.00"));

        // Display account information
        account.displayAccountInfo();

        // Deposit money
        account.deposit(new BigDecimal("250.50"));
        System.out.println("After deposit:");
        account.displayAccountInfo();

        // Withdraw money
        account.withdraw(new BigDecimal("500.00"));
        System.out.println("After withdrawal:");
        account.displayAccountInfo();

        // Attempt to withdraw more than the balance
        account.withdraw(new BigDecimal("800.00")); // Should show an error message
    }
}

