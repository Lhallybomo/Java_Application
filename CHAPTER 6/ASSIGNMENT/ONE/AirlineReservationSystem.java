import java.util.Scanner;

public class AirlineReservationSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // Initialize all seats as empty (false)

        while (true) {
            System.out.println("Please type 1 for First Class and 2 for Economy:");
            int choice = input.nextInt();

            boolean seatAssigned = false;

            if (choice == 1) {
                // Assign First Class seat
                for (int i = 0; i < 5; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Boarding Pass: Seat " + (i + 1) + " - First Class");
                        seatAssigned = true;
                        break;
                    }
                }
            } else if (choice == 2) {
                // Assign Economy seat
                for (int i = 5; i < 10; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Boarding Pass: Seat " + (i + 1) + " - Economy");
                        seatAssigned = true;
                        break;
                    }
                }
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }

            // Check for full section and offer alternative
            if (!seatAssigned) {
                System.out.println("Section full. Would you like to be placed in the other section? (Y/N)");
                String answer = input.next().toUpperCase();
                if (answer.equals("Y")) {
                    // Assign seat in the other section
                    if (choice == 1) {
                        for (int i = 5; i < 10; i++) {
                            if (!seats[i]) {
                                seats[i] = true;
                                System.out.println("Boarding Pass: Seat " + (i + 1) + " - Economy");
                                seatAssigned = true;
                                break;
                            }
                        }
                    } else {
                        for (int i = 0; i < 5; i++) {
                            if (!seats[i]) {
                                seats[i] = true;
                                System.out.println("Boarding Pass: Seat " + (i + 1) + " - First Class");
                                seatAssigned = true;
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                    break; // Exit the loop
                }
            }
        }

        input.close();
    }
}