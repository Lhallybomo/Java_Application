public class MultiDimensionalArraysEnhanced {
    public static void main(String args[]) {
        int[][] numbers = {{3, 4, 5}, {4, 5, 6}, {8, 9, 0}};

        for (int[] row : numbers) { 
            
            for (int col : row) { 
                System.out.println("Element: " + col); 
            }
        }
    }
}