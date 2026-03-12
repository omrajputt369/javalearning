import java.util.ArrayList;
import java.util.List;

/**
 * Central hub for managing all smart devices in the home.
 */
public class SmartHomeHub extends BaseSmartDevice {
    private List<ISmartDevice> connectedDevices;

    public SmartHomeHub(String name) {
        super(name);
        this.connectedDevices = new ArrayList<>();
    }

    public void addDevice(ISmartDevice device) {
        connectedDevices.add(device);
        System.out.println("Device '" + device.getDeviceName() + "' added to hub '" + deviceName + "'.");
    }

    public void activateSecurityMode() {
        System.out.println("[" + deviceName + "] Activating security mode...");
        for (ISmartDevice device : connectedDevices) {
            if (device instanceof SmartSecurityLock) {
                ((SmartSecurityLock) device).lock();
            } else if (device instanceof SurveillanceCamera) {
                ((SurveillanceCamera) device).turnOn();
                ((SurveillanceCamera) device).startRecording();
            }
        }
    }

    public void deactivateAll() {
        System.out.println("[" + deviceName + "] Deactivating all devices...");
        for (ISmartDevice device : connectedDevices) {
            device.turnOff();
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ACTIVE" : "OFFLINE") +
                " | Devices Connected: " + connectedDevices.size();
    }

    public static void main(String[] args) {
        SmartHomeHub mainHub = new SmartHomeHub("Master Hub");
        mainHub.turnOn();

        SmartLight kitchenLight = new SmartLight("Kitchen Light");
        SmartSecurityLock mainLock = new SmartSecurityLock("Main Lock");

        mainHub.addDevice(kitchenLight);
        mainHub.addDevice(mainLock);

        System.out.println(mainHub.getDeviceStatus());
        mainHub.activateSecurityMode();

        mainHub.deactivateAll();
    }
}
