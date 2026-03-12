/**
 * Concrete implementation of a smart security lock.
 */
public class SmartSecurityLock extends BaseSmartDevice {
    private boolean isLocked;
    private int batteryLevel;

    public SmartSecurityLock(String name) {
        super(name);
        this.isLocked = true;
        this.batteryLevel = 100;
    }

    public void unlock() {
        if (isOn) {
            this.isLocked = false;
            System.out.println(deviceName + " is UNLOCKED.");
        } else {
            System.out.println("Cannot unlock, " + deviceName + " is OFF (Dead battery?).");
        }
    }

    public void lock() {
        if (isOn) {
            this.isLocked = true;
            System.out.println(deviceName + " is LOCKED.");
        } else {
            System.out.println("Cannot lock, " + deviceName + " is OFF.");
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ON" : "OFF") +
                " | Lock Protected: " + (isLocked ? "YES" : "NO") +
                " | Battery: " + batteryLevel + "%";
    }

    public static void main(String[] args) {
        SmartSecurityLock frontDoor = new SmartSecurityLock("Front Door Lock");
        System.out.println(frontDoor.getDeviceStatus());

        frontDoor.turnOn();
        frontDoor.unlock();
        System.out.println(frontDoor.getDeviceStatus());

        frontDoor.lock();
        System.out.println(frontDoor.getDeviceStatus());
    }
}
