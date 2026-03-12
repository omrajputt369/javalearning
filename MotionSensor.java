/**
 * Concrete implementation of a smart motion sensor.
 */
public class MotionSensor extends BaseSmartDevice {
    private boolean motionDetected;
    private int sensitivityLevel; // 1-10

    public MotionSensor(String name) {
        super(name);
        this.motionDetected = false;
        this.sensitivityLevel = 5;
    }

    public void setSensitivity(int level) {
        this.sensitivityLevel = Math.max(1, Math.min(10, level));
        System.out.println(deviceName + " sensitivity set to " + sensitivityLevel);
    }

    public void simulateMotion() {
        if (isOn) {
            this.motionDetected = true;
            System.out.println("MOTION DETECTED by " + deviceName + "!");
        }
    }

    public void clearMotion() {
        this.motionDetected = false;
        System.out.println(deviceName + " motion cleared.");
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ON" : "OFF") +
                " | Motion: " + (motionDetected ? "DETECTED" : "NONE") +
                " | Sensitivity: " + sensitivityLevel;
    }

    public static void main(String[] args) {
        MotionSensor hallwaySensor = new MotionSensor("Hallway Sensor");
        hallwaySensor.turnOn();

        System.out.println(hallwaySensor.getDeviceStatus());
        hallwaySensor.simulateMotion();
        System.out.println(hallwaySensor.getDeviceStatus());

        hallwaySensor.clearMotion();
    }
}
