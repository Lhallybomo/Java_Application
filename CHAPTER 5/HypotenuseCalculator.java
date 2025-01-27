import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for side1 and side2
        System.out.print("Enter the length of side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2: ");
        double side2 = input.nextDouble();

        // Calculate and display the hypotenuse
        double hypotenuse = calculateHypotenuse(side1, side2);
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuse);

        // Example usage for Fig. 5.14 triangles
        System.out.println("\nHypotenuse calculations for Fig. 5.14 triangles:");
        double[][] triangleSides = {
            {3.0, 4.0}, // Triangle 1
            {5.0, 12.0}, // Triangle 2
            {8.0, 15.0}  // Triangle 3
        };

        for (int i = 0; i < triangleSides.length; i++) {
            double side1 = triangleSides[i][0];
            double side2 = triangleSides[i][1];
            double triangleHypotenuse = calculateHypotenuse(side1, side2);
            System.out.printf("Triangle %d: Hypotenuse = %.2f%n", i + 1, triangleHypotenuse);
        }

        input.close();
    }

    // Method to calculate the hypotenuse
    public static double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}