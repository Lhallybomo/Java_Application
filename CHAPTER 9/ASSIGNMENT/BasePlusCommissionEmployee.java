
package chapter_9.Assignment;


public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee; // Composition
    private final double baseSalary; // Base salary per week

    // Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                       double grossSales, double commissionRate, double baseSalary) {
        this.commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    // Getters
    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Method to calculate earnings
    public double earnings() {
        return baseSalary + commissionEmployee.earnings();
    }

    // Method to return a string representation of the employee
    @Override
    public String toString() {
        return commissionEmployee.toString() + String.format("\nBase Salary: %.2f", baseSalary);
    }
}
