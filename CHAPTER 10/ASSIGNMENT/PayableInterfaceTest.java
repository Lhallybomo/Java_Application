
package Chapter_10.Assignment;


public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payables;
        payables = new Payable[]{
            new Invoice(/* parameters */),
            new SalariedEmployee(/* parameters */),
            new HourlyEmployee(/* parameters */),
            new CommissionEmployee(/* parameters */),
            new BasePlusCommissionEmployee(/* parameters */)
        };

        for (Payable payable : payables) {
           \ System.out.printf("Payment amount: $%.2f%n", payable.getPaymentAmount());
        }
    }

    private static class Payable {

        public Payable() {
        }

        private Object[] getPaymentAmount() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class SalariedEmployee extends Payable {

        public SalariedEmployee() {
        }
    }
}