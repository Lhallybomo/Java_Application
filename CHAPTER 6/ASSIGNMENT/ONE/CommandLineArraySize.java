public class CommandLineArraySize {

    public static void main(String[] args) {
        int size = 10; // Default size

        // Check if command-line argument is provided
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid argument. Using default size of 10.");
            }
        }

        // Create the array
        int[][] array = new int[size][size];

        // Fill the array with values
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                array[row][col] = row + col + 1;
            }
        }

        // Display the array
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}