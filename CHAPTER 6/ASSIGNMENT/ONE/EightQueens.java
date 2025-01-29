public class EightQueens {

    private static final int BOARD_SIZE = 8;
    private static final int[][] eliminationCounts = {
            {22, 21, 20, 19, 18, 19, 20, 21},
            {21, 20, 18, 16, 14, 16, 18, 20},
            {20, 18, 16, 12, 8, 12, 16, 18},
            {19, 16, 12, 8, 4, 8, 12, 16},
            {18, 14, 8, 4, 0, 4, 8, 14},
            {19, 16, 12, 8, 4, 8, 12, 16},
            {20, 18, 16, 12, 8, 12, 16, 18},
            {21, 20, 18, 16, 14, 16, 18, 20}
    };

    public static void main(String[] args) {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        if (solveEightQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }

    private static boolean solveEightQueens(int[][] board, int row) {
        if (row == BOARD_SIZE) {
            // All queens placed successfully
            return true;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen

                if (solveEightQueens(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0; // Backtrack
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        // Check row
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check diagonals
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if ((i + j == row + col) || (i - j == row - col)) {
                    if (board[i][j] == 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}