import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store the unique numbers
        int count = 0; // Counter for the number of unique numbers

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = input.nextInt();

            // Check for duplicates
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (numbers[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the array
            if (!isDuplicate) {
                numbers[count] = num;
                count++;
            }

            // Display the unique numbers entered so far
            System.out.print("Unique numbers entered so far: ");
            for (int j = 0; j < count; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}