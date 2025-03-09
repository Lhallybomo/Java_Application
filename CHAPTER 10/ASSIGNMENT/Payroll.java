
package Chapter_10.Assignment;


import java.time.LocalDate;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Alice", 3000, new Date(15, 10, 1990)); // Oct 15
        employees[1] = new Employee("Bob", 4000, new Date(5, 11, 1985)); // Nov 5
        employees[2] = new Employee("Charlie", 5000, new Date(22, 10, 1992)); // Oct 22

        double totalPayroll = 0;
        int currentMonth = LocalDate.now().getMonthValue();

        for (Employee emp : employees) {
            double payroll = emp.calculatePayroll();
            // Check for birthday bonus
            if (emp.getBirthDate().getMonth() == currentMonth) {
                payroll += 100.00; // Add birthday bonus
            }
            totalPayroll += payroll;
            System.out.println("Payroll for " + emp.getName() + ": $" + payroll);
        }

        System.out.println("Total Payroll: $" + totalPayroll);
    }
}