import java.util.Random;

public class EightQueensBruteForce {

    private static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        // Part a: Random Brute-Force
        // solveEightQueensRandom();

        // Part b: Exhaustive Brute-Force
        // solveEightQueensExhaustive(); 
    }

    // Part a: Random Brute-Force
    private static void solveEightQueensRandom() {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        Random rand = new Random();

        while (true) {
            // Place queens randomly
            for (int i = 0; i < BOARD_SIZE; i++) {
                int col = rand.nextInt(BOARD_SIZE);
                board[i][col] = 1;
            }

            if (isSolution(board)) {
                printBoard(board);
                break;
            }

            // Clear the board for the next attempt
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    board[i][j] = 0;
                }
            }
        }
    }

    // Part b: Exhaustive Brute-Force
    private static void solveEightQueensExhaustive() {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        if (solveEightQueensExhaustiveRecursive(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }

    private static boolean solveEightQueensExhaustiveRecursive(int[][] board, int row) {
        if (row == BOARD_SIZE) {
            return true;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            board[row][col] = 1;
            if (isSafe(board, row, col) && solveEightQueensExhaustiveRecursive(board, row + 1)) {
                return true;
            }
            board[row][col] = 0;
        }

        return false;
    }

    // Helper methods (same as in the previous response)
    private static boolean isSafe(int[][] board, int row, int col) { 
        // ... (implementation from previous response) ...
    }

    private static void printBoard(int[][] board) {
        // ... (implementation from previous response) ...
    }
}