
package chapter_9.inheritance;


public class Employee {
    private final String employeeId;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;
    
    
    public Employee(String employeeId,String firstName,
            String lastName,String sociaSecurityNumber){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = sociaSecurityNumber;
        
        
    }
    public String getEmployeeid(){
        return employeeId;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
     public void setLastName(String lastName){
        this.lastName= lastName;
    }
     public String SociaSecurityNumber(){
        return socialSecurityNumber;
    }
    @Override public String toString(){
        return String.format("%-15s: %-25s%n%-15s: %-25s%n%-15s: %-25s", 
                "Employee ID",employeeId,
                "Full Name",firstName+
                ""+lastName,"Socia Security Number", 
                socialSecurityNumber);
    }
}
