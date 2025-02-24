
package Chapter_8.Assignment;


public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dt = new DateAndTime(31, 12, 2023, 23, 59, 59);
        System.out.println("Current Date and Time: " + dt.toString());

        // Incrementing the hour to test next day functionality
        dt.incrementHour();
        System.out.println("After incrementing hour: " + dt.toString());
    }
}

