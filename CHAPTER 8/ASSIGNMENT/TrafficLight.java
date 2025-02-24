
package Chapter_8.Assignment;


public enum TrafficLight {
    RED(30),    // Red light duration in seconds
    GREEN(45),  // Green light duration in seconds
    YELLOW(5);  // Yellow light duration in seconds

    private final int duration; // Duration of the light

    // Constructor to set the duration
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Method to get the duration of the light
    public int getDuration() {
        return duration;
    }
}

