import java.util.Random;

public class TortoiseAndHare {

    public static void main(String[] args) {
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        int tortoisePosition = 1;
        int harePosition = 1;

        while (true) {
            // Move the tortoise
            int tortoiseMove = getTortoiseMove();
            tortoisePosition += tortoiseMove;
            if (tortoisePosition < 1) {
                tortoisePosition = 1; // Prevent going below square 1
            }

            // Move the hare
            int hareMove = getHareMove();
            harePosition += hareMove;
            if (harePosition < 1) {
                harePosition = 1; // Prevent going below square 1
            }

            // Display the race track
            for (int i = 1; i <= 70; i++) {
                if (i == tortoisePosition && i == harePosition) {
                    System.out.print("OUCH!!!");
                } else if (i == tortoisePosition) {
                    System.out.print("T");
                } else if (i == harePosition) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Check for winner
            if (tortoisePosition >= 70 && harePosition >= 70) {
                System.out.println("It's a tie.");
                break;
            } else if (tortoisePosition >= 70) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePosition >= 70) {
                System.out.println("Hare wins. Yuch.");
                break;
            }
        }
    }

    private static int getTortoiseMove() {
        Random rand = new Random();
        int move = rand.nextInt(10) + 1; // Generate random number between 1 and 10

        if (move <= 5) {
            return 3; // Fast plod
        } else if (move <= 7) {
            return -6; // Slip
        } else {
            return 1; // Slow plod
        }
    }

    private static int getHareMove() {
        Random rand = new Random();
        int move = rand.nextInt(10) + 1; // Generate random number between 1 and 10

        if (move <= 2) {
            return 0; // Sleep
        } else if (move <= 4) {
            return 9; // Big hop
        } else if (move <= 5) {
            return -12; // Big slip
        } else if (move <= 8) {
            return 1; // Small hop
        } else {
            return -2; // Small slip
        }
    }
}