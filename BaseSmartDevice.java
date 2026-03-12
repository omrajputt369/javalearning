/**
 * Abstract base class for smart devices, implementing common logic.
 */
public abstract class BaseSmartDevice implements ISmartDevice {
    protected String deviceName;
    protected boolean isOn;

    public BaseSmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(deviceName + " is now ON.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(deviceName + " is now OFF.");
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public abstract String getDeviceStatus();
}
