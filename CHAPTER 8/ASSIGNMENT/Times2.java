
package Chapter_8.Assignment;


public final class Times2 {
    private int totalSeconds; // Total seconds since midnight

    // No-argument constructor: initializes totalSeconds to zero
    public Times2() {
        this(0); // invoke constructor with total seconds
    }

    // Constructor with hour supplied, minute and second defaulted to 0
    public Times2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Constructor with hour and minute supplied, second defaulted to 0
    public Times2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Constructor with hour, minute, and second supplied
    public Times2(int hour, int minute, int second) {
        setTime(hour, minute, second); // use setTime to validate and set
    }

    // Constructor with another Times2 object supplied
    public Times2(Times2 time) {
        this(time.getTotalSeconds()); // invoke constructor with total seconds
    }

    // Set Methods
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.totalSeconds = hour * 3600 + minute * 60 + second; // Calculate total seconds
    }

    public void setTotalSeconds(int totalSeconds) {
        if (totalSeconds < 0 || totalSeconds >= 86400) // 86400 seconds in a day
            throw new IllegalArgumentException("totalSeconds must be 0-86399");
        this.totalSeconds = totalSeconds;
    }

    // Get Methods
    public int getHour() {
        return totalSeconds / 3600; // Calculate hour from total seconds
    }

    public int getMinute() {
        return (totalSeconds % 3600) / 60; // Calculate minute from total seconds
    }

    public int getSecond() {
        return totalSeconds % 60; // Calculate second from total seconds
    }

    public int getTotalSeconds() {
        return totalSeconds; // Return total seconds
    }

    // Convert to Universal Time String
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // Convert to Standard Time String

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    void tick() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
