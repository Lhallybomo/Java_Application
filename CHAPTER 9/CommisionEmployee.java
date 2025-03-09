
package chapter_9.inheritance;


public class CommisionEmployee extends Employee{
    private double grossSales;
    private double commisionRate;
    
    
    public CommisionEmployee(String employeeId,String firstName,
            String lastName,String sociaSecurityNumber,
            double grossSales,double commisionRate){
        super(employeeId,firstName,lastName,sociaSecurityNumber);
        
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commisionRate <= 0.0 || commisionRate>=1.0){
            throw new IllegalArgumentException("commision Rate must be "
                    + "> 0.0 and <1.0"); 
            
        }
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setGrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
        
    }
        
       
}
