
package Chapter_8.Assignment;


public final class Time2 {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Constructor
    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Set time method
    public void setTime(int hour, int minute, int second) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
        this.second = (second >= 0 && second < 60) ? second : 0;
    }

    // Method to increment the time by one second
    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute();
        }
    }

    // Method to increment the minute by one
    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }

    // Method to increment the hour by one
    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0; // Reset to 0 for next day
        }
    }

    // Method to display time in HH:MM:SS format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

