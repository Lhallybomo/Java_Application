public class ZeroArrayElements {

    public static void main(String[] args) {
        int[][] sales = new int[3][5];

        // Label the elements with their zeroing order
        int counter = 1;
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = counter++;
            }
        }

        // Zero the elements as in the given program segment
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0; 
            }
        }

        // Display the array with labels (order of zeroing)
        System.out.println("Array with labels (order of zeroing):");
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                System.out.print(sales[row][col] + "\t");
            }
            System.out.println();
        }
    }
}