
package Chapter_10.Assignment;



public class Employee {
    private final String name;
    private final double salary;
    private final Date birthDate;

    public Employee(String name, double salary, Date birthDate) {
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public double calculatePayroll() {
        return salary; // Base payroll amount
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    Object[] earnings() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}