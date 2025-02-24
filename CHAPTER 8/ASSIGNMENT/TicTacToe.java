
package Chapter_8.Assignment;

import java.io.PrintStream;
import java.util.Scanner;
public class TicTacToe {
    // Enum to represent the cell values
    public enum Cell {
        X, O, EMPTY
    }

    private final Cell[][] board; // 3x3 board
    private Cell currentPlayer; // Current player

    // Constructor to initialize the board
    public TicTacToe() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY; // Initialize all cells to EMPTY
            }
        }
        currentPlayer = Cell.X; // X goes first
    }

    // Method to make a move
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != Cell.EMPTY) {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        board[row][col] = currentPlayer; // Place the current player's mark
        return true;
    }

    // Method to check for a win
    public boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    // Method to check for a draw
    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    return false; // If there's an empty cell, it's not a draw
                }
            }
        }
        return true; // All cells are filled
    }

    // Method to print the board
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to play the game
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon && !game.checkDraw()) {
            game.printBoard();
            System.out.println("Current player: " + game.currentPlayer);
            System.out.print("Enter row (0-2) and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                if (game.checkWin()) {
                    gameWon = true;
                    game.printBoard();
                    System.out.println("Player " + game.currentPlayer + " wins!");
                } else {
                    // Switch players
                    game.currentPlayer = (game.currentPlayer == Cell.X) ? Cell.O : Cell.X;
                }
            }
        }

        if (!gameWon) {
            game.printBoard();
            PrintStream PrintStream; /*out*/
            PrintStream = System.out;
        }
    }
}
