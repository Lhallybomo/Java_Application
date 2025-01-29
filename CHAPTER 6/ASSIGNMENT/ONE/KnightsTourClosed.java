import java.util.Random;

public class KnightsTourClosed {

    private static final int BOARD_SIZE = 8;
    private static final int[] horizontalMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] verticalMoves = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        // ... (Parts a and b: same as in the previous response) ...

        // Part c: Run until a closed tour is found
        int[] tourLengths = new int[BOARD_SIZE * BOARD_SIZE + 1]; 
        int tourCount = 0;
        long startTime = System.currentTimeMillis();
        while (true) {
            tourCount++;
            int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
            int tourLength = randomKnightTour(board, 0, 0, 1);
            tourLengths[tourLength]++; 

            if (isClosedTour(board)) {
                printBoard(board);
                printTourLengthStatistics(tourLengths);
                long endTime = System.currentTimeMillis();
                System.out.println("Closed tour found in " + tourCount + " attempts.");
                System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " seconds");
                break;
            }
        }
    }

    private static int randomKnightTour(int[][] board, int row, int col, int moveCount) {
        // ... (Implementation from previous response) ...
    }

    // ... (Other helper methods: printTourLengthStatistics, isValidMove, printBoard) ...

    private static boolean isClosedTour(int[][] board) {
        // Check if the last move is one move away from the starting position (0, 0)
        for (int i = 0; i < 8; i++) {
            int newRow = 0 + verticalMoves[i];
            int newCol = 0 + horizontalMoves[i];
            if (board[newRow][newCol] == BOARD_SIZE * BOARD_SIZE) {
                return true; // Closed tour!
            }
        }
        return false;
    }
}