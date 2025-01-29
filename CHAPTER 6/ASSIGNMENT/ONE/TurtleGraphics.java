import java.util.Arrays;

public class TurtleGraphics {

    private static final int[][] floor = new int[20][20]; // 20x20 array to represent the floor
    private static int turtleX = 0;
    private static int turtleY = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0: North, 1: East, 2: South, 3: West

    public static void main(String[] args) {
        // Example program to draw a square
        int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9}; 

        processCommands(commands);

        // Example program to draw a triangle
        int[] triangleCommands = {2, 5, 5, 3, 5, 5, 3, 5, 5, 1, 6, 9};
        processCommands(triangleCommands);

        // Example program to draw a spiral (requires additional commands)
        int[] spiralCommands = {2, 5, 10, 3, 5, 9, 3, 5, 8, 3, 5, 7, 3, 5, 6, 3, 5, 5, 3, 5, 4, 3, 5, 3, 3, 5, 2, 3, 5, 1, 6, 9};
        processCommands(spiralCommands);
    }

    public static void processCommands(int[] commands) {
        for (int command : commands) {
            switch (command) {
                case 1: // Pen up
                    penDown = false;
                    break;
                case 2: // Pen down
                    penDown = true;
                    break;
                case 3: // Turn right
                    direction = (direction + 1) % 4; // Rotate clockwise
                    break;
                case 4: // Turn left
                    direction = (direction + 3) % 4; // Rotate counterclockwise
                    break;
                case 5: // Move forward
                    moveForward();
                    break;
                case 6: // Display the array
                    displayFloor();
                    break;
                case 9: // End of data
                    // Reset turtle position and pen state for next program
                    turtleX = 0;
                    turtleY = 0;
                    penDown = false;
                    direction = 0;
                    clearFloor(); // Clear the floor for the next program
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }
    }

    private static void moveForward() {
        switch (direction) {
            case 0: // North
                if (turtleY > 0) {
                    turtleY--;
                }
                break;
            case 1: // East
                if (turtleX < floor.length - 1) {
                    turtleX++;
                }
                break;
            case 2: // South
                if (turtleY < floor.length - 1) {
                    turtleY++;
                }
                break;
            case 3: // West
                if (turtleX > 0) {
                    turtleX--;
                }
                break;
        }

        if (penDown) {
            floor[turtleY][turtleX] = 1;
        }
    }

    private static void displayFloor() {
        System.out.println("Drawing:");
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void clearFloor() {
        for (int i = 0; i < floor.length; i++) {
            Arrays.fill(floor[i], 0);
        }
    }
}