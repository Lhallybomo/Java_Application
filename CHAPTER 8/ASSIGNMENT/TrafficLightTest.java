
package Chapter_8.Assignment;


public class TrafficLightTest {
    public static void main(String[] args) {
        // Display each traffic light and its duration
        System.out.println("Traffic Light Durations:");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d seconds%n", light, light.getDuration());
        }
    }
}

