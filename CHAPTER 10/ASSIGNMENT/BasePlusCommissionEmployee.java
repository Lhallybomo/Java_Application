
package Chapter_10.Assignment;


public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    BasePlusCommissionEmployee() {
        super();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPaymentAmount() {
        double totalSalary = baseSalary * 1.10; // Increase by 10%
        // Combine with commission logic
        return 0;
    }
}