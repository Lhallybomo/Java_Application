import java.util.Scanner;

public class SalesCommissions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the number of salespeople in each salary range
        int[] salaryRanges = new int[9];

        // Get the number of salespeople
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = input.nextInt();

        // Get the weekly sales for each salesperson
        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter weekly sales for salesperson " + (i + 1) + ": ");
            double weeklySales = input.nextDouble();

            // Calculate the weekly salary
            int weeklySalary = (int) (200 + (weeklySales * 0.09));

            // Determine the salary range and increment the corresponding counter
            if (weeklySalary >= 200 && weeklySalary <= 299) {
                salaryRanges[0]++;
            } else if (weeklySalary >= 300 && weeklySalary <= 399) {
                salaryRanges[1]++;
            } else if (weeklySalary >= 400 && weeklySalary <= 499) {
                salaryRanges[2]++;
            } else if (weeklySalary >= 500 && weeklySalary <= 599) {
                salaryRanges[3]++;
            } else if (weeklySalary >= 600 && weeklySalary <= 699) {
                salaryRanges[4]++;
            } else if (weeklySalary >= 700 && weeklySalary <= 799) {
                salaryRanges[5]++;
            } else if (weeklySalary >= 800 && weeklySalary <= 899) {
                salaryRanges[6]++;
            } else if (weeklySalary >= 900 && weeklySalary <= 999) {
                salaryRanges[7]++;
            } else {
                salaryRanges[8]++; // $1000 and over
            }
        }

        // Display the results in tabular format
        System.out.println("\nSalesperson Salary Ranges:");
        System.out.println("-------------------------");
        System.out.println("Range\t\tNumber of Salespeople");
        System.out.println("-------------------------");
        System.out.println("$200-$299\t\t" + salaryRanges[0]);
        System.out.println("$300-$399\t\t" + salaryRanges[1]);
        System.out.println("$400-$499\t\t" + salaryRanges[2]);
        System.out.println("$500-$599\t\t" + salaryRanges[3]);
        System.out.println("$600-$699\t\t" + salaryRanges[4]);
        System.out.println("$700-$799\t\t" + salaryRanges[5]);
        System.out.println("$800-$899\t\t" + salaryRanges[6]);
        System.out.println("$900-$999\t\t" + salaryRanges[7]);
        System.out.println("$1000+\t\t" + salaryRanges[8]);

        input.close();
    }
}	