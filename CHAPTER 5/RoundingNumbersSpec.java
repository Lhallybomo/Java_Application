import java.util.Scanner;

public class RoundingNumbersSpec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (or 0 to quit): ");
        double number = input.nextDouble();

        while (number != 0) {
            System.out.println("Original number: " + number);
            System.out.println("Rounded to integer: " + roundToInteger(number));
            System.out.println("Rounded to tenths: " + roundToTenths(number));
            System.out.println("Rounded to hundredths: " + roundToHundredths(number));
            System.out.println("Rounded to thousandths: " + roundToThousandths(number));
            System.out.println();

            System.out.print("Enter a number (or 0 to quit): ");
            number = input.nextDouble();
        }

        System.out.println("Program ended.");
    }

    public static int roundToInteger(double number) {
        return (int) Math.round(number); 
    }

    public static double roundToTenths(double number) {
        return Math.round(number * 10.0) / 10.0; 
    }

    public static double roundToHundredths(double number) {
        return Math.round(number * 100.0) / 100.0; 
    }

    public static double roundToThousandths(double number) {
        return Math.round(number * 1000.0) / 1000.0; 
    }
}