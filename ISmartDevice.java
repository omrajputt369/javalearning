/**
 * Core interface for all smart devices in the automation system.
 */
public interface ISmartDevice {
    /**
     * Powers on the device.
     */
    void turnOn();

    /**
     * Powers off the device.
     */
    void turnOff();

    /**
     * Returns the current operational status.
     * 
     * @return Status string
     */
    String getDeviceStatus();

    /**
     * Returns the name/ID of the device.
     * 
     * @return Device name
     */
    String getDeviceName();
}
