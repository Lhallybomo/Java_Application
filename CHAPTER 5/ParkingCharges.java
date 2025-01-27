import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0; 

        System.out.print("Enter hours parked for customer (or -1 to quit): ");
        int hoursParked = input.nextInt();

        while (hoursParked != -1) {
            double charge = calculateCharges(hoursParked);
            System.out.printf("Charge for this customer: $%.2f%n", charge);
            totalReceipts += charge; 
            System.out.printf("Total receipts: $%.2f%n", totalReceipts);

            System.out.print("Enter hours parked for customer (or -1 to quit): ");
            hoursParked = input.nextInt();
        }

        System.out.println("Parking program ended.");
    }

    public static double calculateCharges(int hoursParked) {
        double charge = 0.0;

        if (hoursParked <= 3) {
            charge = 2.00; 
        } else {
            charge = 2.00 + 0.50 * (hoursParked - 3); 
        }

        // Enforce maximum charge
        if (charge > 10.00) {
            charge = 10.00; 
        }

        return charge;
    }
}