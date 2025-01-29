import java.util.Random;

public class KnightsTourBruteForce {

    private static final int BOARD_SIZE = 8;
    private static final int[] horizontalMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] verticalMoves = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        // Part a: Single random tour
        // int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        // randomKnightTour(board, 0, 0, 1);

        // Part b: 1000 random tours
        // int[] tourLengths = new int[BOARD_SIZE * BOARD_SIZE + 1]; 
        // for (int i = 0; i < 1000; i++) {
        //     int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        //     int tourLength = randomKnightTour(board, 0, 0, 1);
        //     tourLengths[tourLength]++; 
        // }
        // printTourLengthStatistics(tourLengths);

        // Part c: Run until full tour is found
        int[] tourLengths = new int[BOARD_SIZE * BOARD_SIZE + 1]; 
        int tourCount = 0;
        long startTime = System.currentTimeMillis();
        while (true) {
            tourCount++;
            int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
            int tourLength = randomKnightTour(board, 0, 0, 1);
            tourLengths[tourLength]++; 
            if (tourLength == BOARD_SIZE * BOARD_SIZE) {
                printTourLengthStatistics(tourLengths);
                long endTime = System.currentTimeMillis();
                System.out.println("Full tour found in " + tourCount + " attempts.");
                System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " seconds");
                break;
            }
        }

    }

    private static int randomKnightTour(int[][] board, int row, int col, int moveCount) {
        board[row][col] = moveCount;

        if (moveCount == BOARD_SIZE * BOARD_SIZE) {
            return moveCount;
        }

        Random rand = new Random();
        int randomMoveIndex = rand.nextInt(8);

        for (int i = 0; i < 8; i++) {
            int newRow = row + verticalMoves[(randomMoveIndex + i) % 8];
            int newCol = col + horizontalMoves[(randomMoveIndex + i) % 8];

            if (isValidMove(newRow, newCol, board)) {
                int newMoveCount = randomKnightTour(board, newRow, newCol, moveCount + 1);
                if (newMoveCount > 0) {
                    return newMoveCount;
                }
            }
        }

        board[row][col] = 0;
        return 0; // Backtrack
    }

    private static void printTourLengthStatistics(int[] tourLengths) {
        System.out.println("Tour Length\tFrequency");
        for (int i = 0; i < tourLengths.length; i++) {
            if (tourLengths[i] > 0) {
                System.out.println(i + "\t\t" + tourLengths[i]);
            }
        }
    }

    // ... (isValidMove method from previous response) ...
}