
package chapter_9.inheritance;

public class salaryEmployee extends Employee{
    private double dailyWage = 5000.0;
    
    public salaryEmployee(String employeeId,String firstName,
            String lastName,String socialSecurityNumber){
        super(employeeId,firstName,lastName,socialSecurityNumber);
        
        
    }
    public double getDailyWage(){
        return dailyWage  = dailyWage;  
    }
    public void  setDailyWage(double dailyWage){
        this.dailyWage = dailyWage;
    }
    public double earnings(){
        return dailyWage * 28;
    }
    
    @Override public String toString(){
        return super.toString()+String("%n%-15s: %-10.2f%n%-15s: %-10.2f",
        "Gross Sales", grossSales,
        "Commision Rate",commision);
    }
}
