
package Chapter_8.Assignment;

import java.time.LocalDateTime;
public class EmergencyTest {
    public static void main(String[] args) {
        // Create an instance of the Emergency class
        Emergency emergency1 = new Emergency(
            "John Doe",
            "555-1234",
            "123 Main St, Anytown, USA",
            LocalDateTime.now(),
            "Medical Emergency",
            "Ambulance",
            "INC001",
            "PSAP 1"
        );

        // Set additional information
        emergency1.addNotes("Caller reports severe chest pain.");
        emergency1.setWirelessCall(true);
        emergency1.setGpsCoordinates("37.7749° N, 122.4194° W");

        // Display emergency details
        System.out.println("Emergency 1 Details:");
        emergency1.displayEmergencyDetails();
        System.out.println();

        // Create another instance of the Emergency class
        Emergency emergency2 = new Emergency(
            "Jane Smith",
            "555-5678",
            "456 Elm St, Othertown, USA",
            LocalDateTime.now(),
            "Fire",
            "Fire Department",
            "INC002",
            "PSAP 2"
        );

        // Set additional information
        emergency2.addNotes("Caller reports smoke coming from the building.");
        emergency2.setWirelessCall(false);
        emergency2.setGpsCoordinates("37.7749° N, 122.4194° W");

        // Display emergency details
        System.out.println("Emergency 2 Details:");
        emergency2.displayEmergencyDetails();
        System.out.println();

        // Update response status for emergency 1
        emergency1.updateResponseStatus("Dispatched");
        System.out.println("Updated Emergency 1 Status:");
        emergency1.displayEmergencyDetails();
    }
}
