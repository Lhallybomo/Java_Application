
package Chapter_10.Assignment;

import java.io.PrintStream;



public class PayrollSystem {
    public static void main(String[] args) {
        // Create an array of Employee references
        Employe[] employes = new Employe[3];

        // Add PieceWorker objects to the array
        employes[0] = new PieceWorker("Alice", "123-45-6789", 20.0, 50);
        employes[1] = new PieceWorker("Bob", "987-65-4321", 25.0, 30);
        employes[2] = new PieceWorker("Charlie", "111-22-3333", 18.5, 75);

        // Display each employee's details and earnings
        for (Employe employe : employes) {
            System.out.println(employe);
            PrintStream printf = System.out.printf("Earnings: %.2f%n%n", employee.earnings());
        }
    }

    private static class employee {

        private static Object[] earnings() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public employee() {
        }
    }
}