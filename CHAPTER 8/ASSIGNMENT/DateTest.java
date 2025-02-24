
package Chapter_8.Assignment;


public class DateTest {
    public static void main(String[] args) {
        // Create a Date object for testing
        Date date = new Date(1, 31, 2023); // January 31, 2023

        // Test incrementing into the next month
        System.out.println("Testing nextDay method:");
        for (int i = 0; i < 5; i++) { // Increment 5 days
            System.out.println(date);
            date.nextDay();
        }

        // Test incrementing into the next year
        date = new Date(12, 30, 2023); // December 30, 2023
        System.out.println("\nTesting nextDay method into next year:");
        for (int i = 0; i < 5; i++) { // Increment 5 days
            System.out.println(date);
            date.nextDay();
        }
    }
}

