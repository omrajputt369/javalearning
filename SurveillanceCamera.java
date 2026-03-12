/**
 * Concrete implementation of a smart surveillance camera.
 */
public class SurveillanceCamera extends BaseSmartDevice {
    private boolean isRecording;
    private int storageUsedGB; // Simplified simulation

    public SurveillanceCamera(String name) {
        super(name);
        this.isRecording = false;
        this.storageUsedGB = 120; // Some initial data
    }

    public void startRecording() {
        if (isOn) {
            this.isRecording = true;
            System.out.println(deviceName + " started recording.");
        } else {
            System.out.println("Cannot record, " + deviceName + " is OFF.");
        }
    }

    public void stopRecording() {
        this.isRecording = false;
        System.out.println(deviceName + " stopped recording.");
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ON" : "OFF") +
                " | Activity: " + (isRecording ? "RECORDING" : "IDLE") +
                " | Storage: " + storageUsedGB + " GB used";
    }

    public static void main(String[] args) {
        SurveillanceCamera patioCam = new SurveillanceCamera("Patio Camera");
        System.out.println(patioCam.getDeviceStatus());

        patioCam.turnOn();
        patioCam.startRecording();
        System.out.println(patioCam.getDeviceStatus());

        patioCam.stopRecording();
        patioCam.turnOff();
    }
}
