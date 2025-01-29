public class VariableLengthArgumentList {

    public static void main(String[] args) {
        // Test calls with different number of arguments
        System.out.println("Product of 2, 3, 4: " + product(2, 3, 4));
        System.out.println("Product of 5, 10: " + product(5, 10));
        System.out.println("Product of 1, 2, 3, 4, 5: " + product(1, 2, 3, 4, 5));
        System.out.println("Product of 7: " + product(7));
        System.out.println("Product of no arguments: " + product()); // Should return 1
    }

    // Method to calculate the product of integers using variable-length argument list
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}