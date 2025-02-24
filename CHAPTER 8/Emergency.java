
package Chapter_8.Assignment;

import java.time.LocalDateTime;
public class Emergency {
    // Attributes
    private final String callerName;          // Name of the person reporting the emergency
    private final String callerPhoneNumber;   // Phone number of the caller
    private final String location;             // Location of the emergency (address or coordinates)
    private final LocalDateTime timeReported; // Time when the emergency was reported
    private final String natureOfEmergency;    // Description of the emergency (e.g., fire, medical, police)
    private final String responseType;         // Type of response required (e.g., police, ambulance, fire department)
    private String responseStatus;       // Status of the response (e.g., dispatched, en route, resolved)
    private String additionalNotes;      // Any additional notes or information about the emergency
    private final String incidentID;           // Unique identifier for the incident
    private final String psap;                 // Public Service Answering Point handling the call
    private String callerLocation;       // Location of the caller (if different from the emergency location)
    private boolean isWirelessCall;      // Indicates if the call is from a wireless phone
    private String gpsCoordinates;       // GPS coordinates of the caller's location (if available)

    // Constructor
    public Emergency(String callerName, String callerPhoneNumber, String location, 
                     LocalDateTime timeReported, String natureOfEmergency, 
                     String responseType, String incidentID, String psap) {
        this.callerName = callerName;
        this.callerPhoneNumber = callerPhoneNumber;
        this.location = location;
        this.timeReported = timeReported;
        this.natureOfEmergency = natureOfEmergency;
        this.responseType = responseType;
        this.responseStatus = "Pending"; // Default status when created
        this.incidentID = incidentID;
        this.psap = psap;
        this.additionalNotes = "";
        this.isWirelessCall = false; // Default to false
        this.gpsCoordinates = "";
    }

    // Getters and Setters for the attributes
    // (Omitted for brevity, but you would typically include these)

    // Method to update the response status
    public void updateResponseStatus(String newStatus) {
        this.responseStatus = newStatus;
    }

    // Method to add additional notes
    public void addNotes(String notes) {
        this.additionalNotes += notes + "\n"; // Append new notes
    }

    // Method to indicate if the call is wireless
    public void setWirelessCall(boolean isWireless) {
        this.isWirelessCall = isWireless;
    }

    // Method to set GPS coordinates
    public void setGpsCoordinates(String coordinates) {
        this.gpsCoordinates = coordinates;
    }

    // Method to display emergency details
    public void displayEmergencyDetails() {
        System.out.println("Incident ID: " + incidentID);
        System.out.println("Caller Name: " + callerName);
        System.out.println("Caller Phone Number: " + callerPhoneNumber);
        System.out.println("Location: " + location);
        System.out.println("Time Reported: " + timeReported);
        System.out.println("Nature of Emergency: " + natureOfEmergency);
        System.out.println("Response Type: " + responseType);
        System.out.println("Response Status: " + responseStatus);
        System.out.println("Additional Notes: " + additionalNotes);
        System.out.println("PSAP: " + psap);
        System.out.println("Caller Location: " + callerLocation);
        System.out.println("Is Wireless Call: " + isWirelessCall);
        System.out.println("GPS Coordinates: " + gpsCoordinates);
    }
}

