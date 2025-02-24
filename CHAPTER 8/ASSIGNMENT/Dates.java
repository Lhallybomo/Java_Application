
package Chapter_8.Assignment;

import java.util.HashMap;
import java.util.Map;
public class Dates {
    private int day;   // Day of the month
    private int month; // Month (1-12)
    private final int year;  // Year

    // Constructor for MM/DD/YYYY format
    public Dates(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor for "Month Day, Year" format
    public Dates(String monthName, int day, int year) {
        this.year = year;
        this.day = day;
        this.month = convertMonthToNumber(monthName);
    }

    // Constructor for "Day of the Year" format
    public Dates(int dayOfYear, int year) {
        this.year = year;
        this.month = 1;
        this.day = dayOfYear;

        // Adjust month and day based on the day of the year
        while (dayOfYear > daysInMonth(month, year)) {
            dayOfYear -= daysInMonth(month, year);
            month++;
        }
        this.day = dayOfYear;
    }

    // Method to convert month name to number
    private int convertMonthToNumber(String monthName) {
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);

        return monthMap.getOrDefault(monthName, 0);
    }

    // Method to get the number of days in a month
    private int daysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (isLeapYear(year)) ? 29 : 28;
            default -> 0;
        }; // Invalid month
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to output date in MM/DD/YYYY format
    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    // Method to output date in "Month Day, Year" format
    public String toLongFormat() {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return String.format("%s %d, %d", monthNames[month - 1], day, year);
    }

    // Method to output date in "DDD YYYY" format
    public String toDayOfYearFormat() {
        return String.format("%03d %d", getDayOfYear(), year);
    }

    // Method to calculate the day of the year
    private int getDayOfYear() {
        int dayOfYear = 0;
        for (int m = 1; m < month; m++) {
            dayOfYear += daysInMonth(m, year);
        }
        dayOfYear += day;
        return dayOfYear;
    }
}

