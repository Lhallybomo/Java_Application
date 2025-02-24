
package Chapter_8.Assignment;


public class DateAndTime {
    // Time2 class to handle time
class Time2 {
    private int hour;   // 0-23
    private final int minute; // 0-59
    private final int second; // 0-59

    public Time2(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0; // Reset hour to 0 after 23
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

// Date class to handle date
class Date {
    private int day;   // 1-31
    private int month; // 1-12
    private int year;  // e.g., 2023

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void nextDay() {
        day++;
        if (day > 30) { // Simplified for demonstration; consider month lengths
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

// DateAndTime class combining Date and Time2
    private final Time2 time;
    private final Date date;

    public DateAndTime(int day, int month, int year, int hour, int minute, int second) {
        this.date = new Date(day, month, year);
        this.time = new Time2(hour, minute, second);
    }

    public void incrementHour() {
        time.incrementHour();
        if (time.toUniversalString().startsWith("00:")) { // Check if hour reset
            date.nextDay();
        }
    }

@Override
    public String toString() {
        return date.toString() + " " + time.toUniversalString();
    }

    public String toUniversalString() {
        return date.toString() + " " + time.toUniversalString();
    }
}
