
package chapter_9.Assignment;


public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final double grossSales; // Gross weekly sales
    private final double commissionRate; // Commission percentage

    // Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // Method to calculate earnings
    public double earnings() {
        return grossSales * commissionRate;
    }

    // Method to return a string representation of the employee
    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s\nGross Sales: %.2f\nCommission Rate: %.2f",
                firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}
