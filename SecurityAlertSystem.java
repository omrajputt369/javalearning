import java.util.ArrayList;
import java.util.List;

/**
 * Handles security alert management and notification logging for the smart
 * home.
 */
public class SecurityAlertSystem extends BaseSmartDevice {
    private List<String> alertLog;
    private boolean isPanicMode;

    public SecurityAlertSystem(String name) {
        super(name);
        this.alertLog = new ArrayList<>();
        this.isPanicMode = false;
    }

    public void logAlert(String severity, String message) {
        if (isOn) {
            String entry = "[" + severity.toUpperCase() + "] " + message;
            alertLog.add(entry);
            System.out.println("Alert System Logged: " + entry);
        }
    }

    public void triggerPanic() {
        if (isOn) {
            this.isPanicMode = true;
            logAlert("CRITICAL", "Panic mode triggered by user!");
            System.out.println("ALERT: PANIC MODE ACTIVE! Calling emergency services (Simulated)...");
        }
    }

    public void resetSystem() {
        this.isPanicMode = false;
        System.out.println(deviceName + " security state reset to normal.");
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ARMED" : "DISARMED") +
                " | Alerts Logged: " + alertLog.size() +
                " | Panic Mode: " + (isPanicMode ? "ACTIVE" : "NO");
    }

    public static void main(String[] args) {
        SecurityAlertSystem alerts = new SecurityAlertSystem("Home Protection Unit");
        alerts.turnOn();

        alerts.logAlert("Warning", "Back door sensor timeout.");
        alerts.triggerPanic();

        System.out.println(alerts.getDeviceStatus());
        alerts.resetSystem();
    }
}
