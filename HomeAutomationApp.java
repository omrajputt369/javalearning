/**
 * Simulation of a mobile application for home automation control.
 */
public class HomeAutomationApp {
    private String userProfile;
    private SmartHomeHub connectedHub;

    public HomeAutomationApp(String userProfile, SmartHomeHub hub) {
        this.userProfile = userProfile;
        this.connectedHub = hub;
    }

    public void launchApp() {
        System.out.println("--- Welcome to SmartHome App, " + userProfile + " ---");
        System.out.println("Connected to: " + connectedHub.getDeviceName());
        System.out.println("Hub Status: " + connectedHub.getDeviceStatus());
    }

    public void quickActionSecurity() {
        System.out.println("[App] Executing Quick Action: Security On");
        connectedHub.activateSecurityMode();
    }

    public void quickActionAllOff() {
        System.out.println("[App] Executing Quick Action: All Devices Off");
        connectedHub.deactivateAll();
    }

    public static void main(String[] args) {
        SmartHomeHub myHub = new SmartHomeHub("Home Hub Pro");
        myHub.turnOn();

        myHub.addDevice(new SmartLight("Living Room"));
        myHub.addDevice(new SmartSecurityLock("Front Door"));

        HomeAutomationApp mobileApp = new HomeAutomationApp("Om", myHub);
        mobileApp.launchApp();

        System.out.println("\nUser tapped 'Security Mode'...");
        mobileApp.quickActionSecurity();

        System.out.println("\nUser tapped 'Night Mode'...");
        mobileApp.quickActionAllOff();
    }
}
