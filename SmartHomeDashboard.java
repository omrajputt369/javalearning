import java.util.ArrayList;
import java.util.List;

/**
 * Integrated dashboard simulating a central control panel for the Smart Home
 * Automation System.
 */
public class SmartHomeDashboard extends BaseSmartDevice {
    private List<ISmartDevice> systemComponents;

    public SmartHomeDashboard(String name) {
        super(name);
        this.systemComponents = new ArrayList<>();
    }

    public void addComponent(ISmartDevice component) {
        systemComponents.add(component);
    }

    @Override
    public String getDeviceStatus() {
        return "Dashboard: " + (isOn ? "ACTIVE" : "OFF") +
                " | Monitoring " + systemComponents.size() + " devices";
    }

    public void displaySystemOverview() {
        if (isOn) {
            System.out.println("\n========== SMART HOME DASHBOARD ==========");
            System.out.println("System Name: " + deviceName);
            System.out.println("Timestamp: " + new java.util.Date());
            System.out.println("------------------------------------------");

            for (ISmartDevice device : systemComponents) {
                System.out.println("[" + device.getDeviceName() + "] " + device.getDeviceStatus());
            }
            System.out.println("==========================================\n");
        } else {
            System.out.println("Dashboard is OFFLINE. Please turn it on.");
        }
    }

    public static void main(String[] args) {
        SmartHomeDashboard mainConsole = new SmartHomeDashboard("Master Control Center");

        // Simulating various systems
        SmartLight kitchen = new SmartLight("Kitchen Light");
        SmartThermostat hvac = new SmartThermostat("Main T-Stat");
        SmartSecurityLock door = new SmartSecurityLock("Front Door");
        EnergyOptimizer eco = new EnergyOptimizer("Energy Monitor");
        ConnectivityStats wifi = new ConnectivityStats("WiFi Mesh");

        kitchen.turnOn();
        hvac.turnOn();
        hvac.setTargetTemperature(23.0);

        mainConsole.addComponent(kitchen);
        mainConsole.addComponent(hvac);
        mainConsole.addComponent(door);
        mainConsole.addComponent(eco);
        mainConsole.addComponent(wifi);

        mainConsole.turnOn();
        mainConsole.displaySystemOverview();
    }
}
