/**
 * Simulates firmware update management for smart devices.
 */
public class FirmwareManager extends BaseSmartDevice {
    private String currentVersion;
    private boolean isUpdating;

    public FirmwareManager(String name) {
        super(name);
        this.currentVersion = "v1.0.0";
        this.isUpdating = false;
    }

    public void checkForUpdates() {
        if (isOn) {
            System.out.println(deviceName + " checking for newer firmware...");
            System.out.println("Update AVAILABLE: v1.1.0 (Security Patches)");
        }
    }

    public void installUpdate(String version) {
        if (isOn) {
            this.isUpdating = true;
            System.out.println("Installing update " + version + "...");
            System.out.println("Applying changes... Done.");
            this.currentVersion = version;
            this.isUpdating = false;
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "CONNECTED" : "OFFLINE") +
                " | Firmware: " + currentVersion +
                " | Activity: " + (isUpdating ? "UPDATING" : "IDLE");
    }

    public static void main(String[] args) {
        FirmwareManager mgr = new FirmwareManager("Update Service");
        mgr.turnOn();

        System.out.println(mgr.getDeviceStatus());
        mgr.checkForUpdates();
        mgr.installUpdate("v1.1.0");

        System.out.println(mgr.getDeviceStatus());
    }
}
