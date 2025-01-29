public class KnightsTour {

    private static final int BOARD_SIZE = 8;
    private static final int[] horizontalMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] verticalMoves = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        // Part b: Basic Knight's Tour
        // int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        // knightTour(board, 0, 0, 1); 

        // Part c: Knight's Tour with Accessibility Heuristic
        // int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        // int[][] accessibility = getAccessibilityArray(); 
        // knightTourWithAccessibility(board, accessibility, 0, 0, 1); 

        // Part d: Knight's Tour with Look-Ahead Heuristic
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        int[][] accessibility = getAccessibilityArray();
        knightTourWithLookAhead(board, accessibility, 0, 0, 1); 
    }

    // Part b: Basic Knight's Tour
    private static boolean knightTour(int[][] board, int row, int col, int moveCount) {
        if (moveCount == BOARD_SIZE * BOARD_SIZE) {
            // Successful tour!
            printBoard(board);
            return true;
        }

        board[row][col] = moveCount;

        for (int i = 0; i < 8; i++) {
            int newRow = row + verticalMoves[i];
            int newCol = col + horizontalMoves[i];

            if (isValidMove(newRow, newCol, board)) {
                if (knightTour(board, newRow, newCol, moveCount + 1)) {
                    return true;
                }
            }
        }

        // Backtrack if no valid move found
        board[row][col] = 0;
        return false;
    }

    // Part c: Knight's Tour with Accessibility Heuristic
    private static boolean knightTourWithAccessibility(int[][] board, int[][] accessibility, int row, int col, int moveCount) {
        if (moveCount == BOARD_SIZE * BOARD_SIZE) {
            // Successful tour!
            printBoard(board);
            return true;
        }

        board[row][col] = moveCount;

        int minAccessibility = Integer.MAX_VALUE;
        int bestMoveIndex = -1;

        for (int i = 0; i < 8; i++) {
            int newRow = row + verticalMoves[i];
            int newCol = col + horizontalMoves[i];

            if (isValidMove(newRow, newCol, board) && accessibility[newRow][newCol] < minAccessibility) {
                minAccessibility = accessibility[newRow][newCol];
                bestMoveIndex = i;
            }
        }

        if (bestMoveIndex != -1) {
            // Move to the square with the lowest accessibility
            int newRow = row + verticalMoves[bestMoveIndex];
            int newCol = col + horizontalMoves[bestMoveIndex];

            // Update accessibility values for neighboring squares
            for (int i = 0; i < 8; i++) {
                int neighborRow = newRow + verticalMoves[i];
                int neighborCol = newCol + horizontalMoves[i];

                if (isValidMove(neighborRow, neighborCol, board)) {
                    accessibility[neighborRow][neighborCol]--;
                }
            }

            if (knightTourWithAccessibility(board, accessibility, newRow, newCol, moveCount + 1)) {
                return true;
            }

            // Backtrack - restore accessibility values
            for (int i = 0; i < 8; i++) {
                int neighborRow = newRow + verticalMoves[i];
                int neighborCol = newCol + horizontalMoves[i];

                if (isValidMove(neighborRow, neighborCol, board)) {
                    accessibility[neighborRow][neighborCol]++;
                }
            }
        }

        board[row][col] = 0;
        return false;
    }

    // Part d: Knight's Tour with Look-Ahead Heuristic
    private static boolean knightTourWithLookAhead(int[][] board, int[][] accessibility, int row, int col, int moveCount) {
        if (moveCount == BOARD_SIZE * BOARD_SIZE) {
            // Successful tour!
            printBoard(board);
            return true;
        }

        board[row][col] = moveCount;

        int[] bestMoves = findBestMoves(board, accessibility, row, col);

        for (int moveIndex : bestMoves) {
            int newRow = row + verticalMoves[moveIndex];
            int newCol = col + horizontalMoves[moveIndex];

            // Update accessibility values for neighboring squares
            for (int i = 0; i < 8; i++) {
                int neighborRow = newRow + verticalMoves[i];
                int neighborCol = newCol + horizontalMoves[i];

                if (isValidMove(neighborRow, neighborCol, board)) {
                    accessibility[neighborRow][neighborCol]--;
                }
            }

            if (knightTourWithLookAhead(board, accessibility, newRow, newCol, moveCount + 1)) {
                return true;
            }

            // Backtrack - restore accessibility values
            for (int i = 0; i < 8; i++) {
                int neighborRow = newRow + verticalMoves[i];
                int neighborCol = newCol + horizontalMoves[i];

                if (isValidMove(neighborRow, neighborCol, board)) {
                    accessibility[neighborRow][neighborCol]++;
                }
            }
        }

        board[row][col] = 0;
        return false;
    }

    // Helper method to find best moves based on look-ahead
    private static int[] findBestMoves(int[][] board, int[][] accessibility, int row, int col) {
        int[] bestMoves = new int[8];
        int numBestMoves = 0;
        int minAccessibility = Integer.MAX_VALUE;

        for (int i = 0; i < 8; i++) {
            int newRow = row + verticalMoves[i];
            int newCol = col + horizontalMoves[i];

            if (isValidMove(newRow, newCol, board) && accessibility[newRow][newCol] == minAccessibility) {
                bestMoves[numBestMoves++] = i;
            } else if (isValidMove(newRow, newCol, board) && accessibility[newRow][newCol] < minAccessibility) {
                minAccessibility = accessibility[newRow][newCol];
                numBestMoves = 0;
                bestMoves[numBestMoves++] = i;
            }
        }

        return Arrays.copyOfRange(bestMoves, 0, numBestMoves);
    }

    private static boolean isValidMove(int row, int col, int[][] board) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == 0;
    }

    private static int[][] getAccessibilityArray() {
        int[][] accessibility = {
                {2, 3, 4, 4, 4, 4, 3, 2},
                {3, 4, 6, 6, 6, 6, 4, 3},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {3, 4, 6, 6, 6, 6, 4, 3},
                {2, 3, 4, 4, 4, 4, 3, 2}
        };
        return accessibility;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}