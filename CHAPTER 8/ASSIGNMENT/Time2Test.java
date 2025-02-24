
package Chapter_8.Assignment;


public class Time2Test {
    public static void main(String[] args) {
        // Test case 1: Incrementing into the next minute
        Time2 time1 = new Time2(10, 59, 59);
        System.out.println("Initial time: " + time1);
        time1.tick(); // Increment by one second
        System.out.println("After tick: " + time1); // Should be 11:00:00

        // Test case 2: Incrementing into the next hour
        Time2 time2 = new Time2(11, 59, 59);
        System.out.println("\nInitial time: " + time2);
        time2.tick(); // Increment by one second
        System.out.println("After tick: " + time2); // Should be 12:00:00

        // Test case 3: Incrementing into the next day
        Time2 time3 = new Time2(23, 59, 59);
        System.out.println("\nInitial time: " + time3);
        time3.tick(); // Increment by one second
        System.out.println("After tick: " + time3); // Should be 00:00:00
    }
}

