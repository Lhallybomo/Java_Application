import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (or 0 to quit): ");
        double number = input.nextDouble();

        while (number != 0) {
            int roundedNumber = (int) Math.floor(number + 0.5); 
            System.out.println("Original number: " + number);
            System.out.println("Rounded number: " + roundedNumber);
            System.out.println();

            System.out.print("Enter a number (or 0 to quit): ");
            number = input.nextDouble();
        }

        System.out.println("Program ended.");
    }
}