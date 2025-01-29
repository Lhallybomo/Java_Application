import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {
        final int NUMBER_OF_ROLLS = 36000000;
        int[] diceSums = new int[13]; // Array to store the frequency of each sum (2-12)

        Random random = new Random();

        // Roll the dice and count the sums
        for (int i = 0; i < NUMBER_OF_ROLLS; i++) {
            int die1 = random.nextInt(6) + 1; // Generate random number between 1 and 6
            int die2 = random.nextInt(6) + 1; // Generate random number between 1 and 6
            diceSums[die1 + die2]++; // Increment the count for the sum
        }

        // Display the results in tabular format
        System.out.println("Dice Rolling Simulation");
        System.out.println("----------------------");
        System.out.println("Sum\tFrequency");
        System.out.println("----------------------");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d\t%d\n", i, diceSums[i]);
        }
    }
}