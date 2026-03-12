/**
 * Integrates various climate control components (Thermostat, HVAC) into a
 * unified controller.
 */
public class ClimateController extends BaseSmartDevice {
    private SmartThermostat linkedThermostat;
    private boolean hvacActive;

    public ClimateController(String name, SmartThermostat thermostat) {
        super(name);
        this.linkedThermostat = thermostat;
        this.hvacActive = false;
    }

    public void optimizeClimate() {
        if (isOn) {
            System.out.println("[" + deviceName + "] Synchronizing climate settings...");
            linkedThermostat.turnOn();
            linkedThermostat.setMode("Eco");
            this.hvacActive = true;
            System.out.println("HVAC system is now active and optimized.");
        }
    }

    public void shutdown() {
        this.hvacActive = false;
        linkedThermostat.turnOff();
        System.out.println(deviceName + " climate systems SHUT DOWN.");
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ACTIVE" : "OFF") +
                " | HVAC: " + (hvacActive ? "ON" : "OFF") +
                " | Linked to: " + linkedThermostat.getDeviceName();
    }

    public static void main(String[] args) {
        SmartThermostat mainTstat = new SmartThermostat("Hallway Thermostat");
        ClimateController ctrl = new ClimateController("Climate Central", mainTstat);

        ctrl.turnOn();
        ctrl.optimizeClimate();
        System.out.println(ctrl.getDeviceStatus());

        ctrl.shutdown();
    }
}
