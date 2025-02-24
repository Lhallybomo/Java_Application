
package chapter_9.Assignment;


public class BasePlusCommissionEmployeeTest {
     public static void main(String[] args) {
        // Create a BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "John", "Doe", "123-45-6789", 10000, 0.06, 300);

        // Display employee details
        System.out.println(employee);

        // Calculate and display earnings
        System.out.printf("Earnings: %.2f%n", employee.earnings());
    }
}

