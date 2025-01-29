import java.util.Scanner;

public class TotalSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize 2D array to store sales data
        int[][] sales = new int[5][4]; // 5 products, 4 salespeople

        // Get sales data for last month
        System.out.println("Enter sales data for last month:");
        while (true) {
            System.out.print("Enter salesperson number (0 to quit): ");
            int salesperson = input.nextInt();

            if (salesperson == 0) {
                break; // Exit the loop if salesperson number is 0
            }

            System.out.print("Enter product number: ");
            int product = input.nextInt();

            System.out.print("Enter total sales for this product: ");
            int amount = input.nextInt();

            // Update sales data in the array
            sales[product - 1][salesperson - 1] += amount; // Adjust indices for 1-based input
        }

        // Display sales data in tabular format
        System.out.println("\nSales Summary:");
        System.out.print("\t");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Salesperson %d\t", i + 1);
        }
        System.out.println("Total");

        int[] productTotals = new int[5];
        for (int i = 0; i < 5; i++) {
            int rowTotal = 0;
            System.out.printf("Product %d\t", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t\t", sales[i][j]);
                rowTotal += sales[i][j];
            }
            System.out.printf("%d\n", rowTotal);
            productTotals[i] = rowTotal;
        }

        System.out.print("Total\t\t");
        int[] salespersonTotals = new int[4];
        for (int j = 0; j < 4; j++) {
            int colTotal = 0;
            for (int i = 0; i < 5; i++) {
                colTotal += sales[i][j];
            }
            System.out.printf("%d\t\t", colTotal);
            salespersonTotals[j] = colTotal;
        }
        System.out.println();

        // Display total sales for each product and salesperson
        System.out.println("\nTotal Sales:");
        System.out.println("Product:\t" + java.util.Arrays.toString(productTotals));
        System.out.println("Salesperson:\t" + java.util.Arrays.toString(salespersonTotals));
    }
}